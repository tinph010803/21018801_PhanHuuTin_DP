// src/controllers/product.controller.js
const Product = require('../models/product.model');

// Create
exports.createProduct = async (req, res) => {
  try {
    const product = new Product(req.body);
    const saved = await product.save();
    res.status(201).json(saved);
  } catch (err) {
    res.status(400).json({ error: err.message });
  }
};

// Read
exports.getProduct = async (req, res) => {
  try {
    const product = await Product.findById(req.params.id);
    if (!product) return res.status(404).send('Not found');
    res.json(product);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
};

// Update
exports.updateProduct = async (req, res) => {
  try {
    const updated = await Product.findByIdAndUpdate(req.params.id, req.body, { new: true });
    res.json(updated);
  } catch (err) {
    res.status(400).json({ error: err.message });
  }
};

// Delete
exports.deleteProduct = async (req, res) => {
  try {
    await Product.findByIdAndDelete(req.params.id);
    res.send('Deleted');
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
};
