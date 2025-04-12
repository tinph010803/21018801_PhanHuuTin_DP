// src/app.js
const express = require('express');
const productRoutes = require('./routes/product.routes');

const app = express();
app.use(express.json());
app.use('/products', productRoutes);

app.get('/', (req, res) => {
  res.send('Product Service is running');
});

module.exports = app;
