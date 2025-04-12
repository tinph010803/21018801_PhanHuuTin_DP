const mongoose = require('mongoose');

const orderSchema = new mongoose.Schema({
  customerId: String,
  productIds: [String],
  totalPrice: Number,
  status: {
    type: String,
    enum: ['pending', 'confirmed', 'shipped', 'cancelled'],
    default: 'pending'
  },
  createdAt: {
    type: Date,
    default: Date.now
  }
});

module.exports = mongoose.model('Order', orderSchema);
