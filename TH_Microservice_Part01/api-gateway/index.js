const express = require('express');
const { createProxyMiddleware } = require('http-proxy-middleware');
require('dotenv').config();

const app = express();

// Cho phép nhận JSON từ client
app.use(express.json());

// Middleware log mọi request tới Gateway (debug)
app.use((req, res, next) => {
  console.log(`[GATEWAY] ${req.method} ${req.originalUrl}`);
  next();
});

// Chuyển tiếp đến Product Service
app.use('/products', createProxyMiddleware({
  target: process.env.PRODUCT_SERVICE,
  changeOrigin: true
}));

// Chuyển tiếp đến Customer Service
app.use('/customers', createProxyMiddleware({
  target: process.env.CUSTOMER_SERVICE,
  changeOrigin: true
}));

// Chuyển tiếp đến Order Service
app.use('/orders', createProxyMiddleware({
  target: process.env.ORDER_SERVICE,
  changeOrigin: true
}));

// Kiểm tra API Gateway có đang chạy
app.get('/', (req, res) => {
  res.send('API Gateway is running 🚀');
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`✅ API Gateway listening on port ${PORT}`);
});
