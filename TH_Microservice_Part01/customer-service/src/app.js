const express = require('express');
const customerRoutes = require('./routes/customer.routes');

const app = express();
app.use(express.json());

app.use('/customers', customerRoutes);

app.get('/', (req, res) => {
  res.send('Customer Service is running');
});

module.exports = app;
