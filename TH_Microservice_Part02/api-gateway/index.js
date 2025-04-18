const express = require('express');
const axios = require('axios');
const mongoose = require('mongoose');
const createBreaker = require('./breaker');
const rateLimit = require('express-rate-limit');
const limiter = rateLimit({
  windowMs: 15 * 1000, // 15 giây
  max: 10, // tối đa 10 request trong 15s
  message: '⛔ Too many requests, please try again later.'
});
const app = express();
app.use(express.json());
app.use('/pay', limiter);
app.use('/decrement', limiter);
app.use('/ship', limiter);
app.use('/order', limiter);

// --- MongoDB Connection ---
const mongoUri = process.env.MONGO_URI || 'mongodb://localhost:27017/fallback';
mongoose.connect(mongoUri, {
  useNewUrlParser: true,
  useUnifiedTopology: true
}).then(() => {
  console.log('✅ Connected to MongoDB');
}).catch(err => {
  console.error('❌ MongoDB connection error:', err.message);
});

// --- Mongoose Models ---
const Order = mongoose.model('Order', new mongoose.Schema({
  orderId: Number,
  item: String,
  quantity: Number,
  amount: Number,
  address: String,
  createdAt: { type: Date, default: Date.now }
}));

const PaymentLog = mongoose.model('PaymentLog', new mongoose.Schema({
  orderId: Number,
  amount: Number,
  createdAt: { type: Date, default: Date.now }
}));

const InventoryLog = mongoose.model('InventoryLog', new mongoose.Schema({
  item: String,
  quantity: Number,
  createdAt: { type: Date, default: Date.now }
}));

const ShippingLog = mongoose.model('ShippingLog', new mongoose.Schema({
  orderId: Number,
  address: String,
  createdAt: { type: Date, default: Date.now }
}));

// --- Microservice URLs ---
const PAYMENT = 'http://payment-service:3001';
const INVENTORY = 'http://inventory-service:3002';
const SHIPPING = 'http://shipping-service:3003';
const breakerPay = createBreaker(`${PAYMENT}/pay`);
const breakerInventory = createBreaker(`${INVENTORY}/decrement`);
const breakerShip = createBreaker(`${SHIPPING}/ship`);

// --- Route: Create Full Order ---
app.post('/order', async (req, res) => {
  const { item, quantity, amount, address } = req.body;
  const orderId = Date.now();

  try {
    const inventory = await breakerInventory.fire({ item, quantity });
    const payment = await breakerPay.fire({ orderId, amount });
    const shipping = await breakerShip.fire({ orderId, address });


    await Order.create({ orderId, item, quantity, amount, address });

    res.json({
      message: '✔️ Order processed',
      inventory: inventory.data,
      payment: payment.data,
      shipping: shipping.data
    });
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});

// --- Route: /pay ---
app.post('/pay', async (req, res) => {
  const { orderId, amount } = req.body;
  try {
    const result = await breakerPay.fire({ orderId, amount });
    await PaymentLog.create({ orderId, amount });
    res.json(result.data);
  } catch (err) {
    res.status(503).json({ error: err.message });
  }
});

// --- Route: /decrement ---
app.post('/decrement', async (req, res) => {
  const { item, quantity } = req.body;
  try {
    const result = await breakerInventory.fire({ item, quantity });
    await InventoryLog.create({ item, quantity });
    res.json(result.data);
  } catch (err) {
    res.status(503).json({ error: err.message });
  }
});

// --- Route: /ship ---
app.post('/ship', async (req, res) => {
  const { orderId, address } = req.body;
  try {
    const result = await breakerShip.fire({ orderId, address });
    await ShippingLog.create({ orderId, address });
    res.json(result.data);
  } catch (err) {
    res.status(503).json({ error: err.message });
  }
});

// --- Server ---
app.listen(3000, () => console.log('🚀 API Gateway running on port 3000'));
