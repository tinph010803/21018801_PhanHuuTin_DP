const express = require('express');
const orderRoutes = require('./routes/order.routes');

const app = express();
app.use(express.json());

app.use('/orders', orderRoutes);

app.get('/', (req, res) => {
  res.send('Order Service is running');
});

module.exports = app;
