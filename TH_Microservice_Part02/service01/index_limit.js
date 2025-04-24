const express = require('express');
const axios = require('axios');
const rateLimit = require('express-rate-limit');

const app = express();

let requestCounts = {};

const limiter = rateLimit({
    windowMs: 60 * 1000,     // 1 phút
    max: 5,                 // tối đa 5 request mỗi IP
    standardHeaders: true,
    legacyHeaders: false,
    message: '⛔ Too many requests, please wait a minute.',
    handler: (req, res, next, options) => {
      const ip = req.ip;
      const count = requestCounts[ip] || 0;
      console.log(`❌ IP ${ip} has exceeded the limit: ${count}/5`);
      res.status(429).send(`⛔ Too many requests (${count}/5), please wait a minute.`);
    },
    keyGenerator: (req) => req.ip
  });
app.use((req, res, next) => {
  const ip = req.ip;
  requestCounts[ip] = (requestCounts[ip] || 0) + 1;
  console.log(`📊 Request count from ${ip}: ${requestCounts[ip]}/5`);
  next();
});

app.get('/limited', limiter, async (req, res) => {
  try {
    const response = await axios.get('http://localhost:4000/data');
    res.send(`✅ Success! Request ${requestCounts[req.ip]}/5\n` + response.data);
  } catch (err) {
    res.status(503).send('Service B is down.');
  }
});

// Xoá đếm mỗi phút để reset
setInterval(() => {
  requestCounts = {}; // reset toàn bộ IP
}, 60 * 1000);

app.listen(3000, () => {
  console.log('Service A with Rate Limiter running on http://localhost:3000');
});
