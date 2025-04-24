const express = require('express');
const axios = require('axios');
const CircuitBreaker = require('opossum');

const app = express();

// Hàm gọi Service B
const callServiceB = async () => {
  return await axios.get('http://localhost:4000/data');
};

// Cấu hình Circuit Breaker
const breaker = new CircuitBreaker(callServiceB, {
  errorThresholdPercentage: 20,   
  volumeThreshold: 4,              
  resetTimeout: 5000,             
  rollingCountTimeout: 10000,
  rollingCountBuckets: 1
});

breaker.on('open', () => console.log('Circuit is OPEN'));
breaker.on('halfOpen', () => console.log(' Circuit is HALF-OPEN '));
breaker.on('close', () => console.log('Circuit is CLOSED'));

// Xử lý route gọi qua CB
app.get('/cb', async (req, res) => {
  console.log('\n [REQUEST] /cb');
  console.log(' Breaker State:', breaker.opened ? 'OPEN' : 'CLOSED or HALF-OPEN');

  try {
    const result = await breaker.fire();
    res.send(result.data);
  } catch (err) {
    if (breaker.opened) {
      return res.status(503).send('⛔ Circuit Breaker is OPEN. Please wait.');
    }
    res.status(503).send('❌ Service B is down, please try again later.');
  }
});

app.listen(3000, () => {
  console.log('Service A running on http://localhost:3000');
});
