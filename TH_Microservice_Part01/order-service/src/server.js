const app = require('./app');
const mongoose = require('mongoose');
require('dotenv').config();

const PORT = process.env.PORT || 4003;
const MONGODB_URI = process.env.MONGODB_URI;

mongoose.connect(MONGODB_URI)
  .then(() => {
    console.log('Connected to MongoDB (Order)');
    app.listen(PORT, () => {
      console.log(`Order Service running on port ${PORT}`);
    });
  })
  .catch(err => console.error('MongoDB connection error:', err));
