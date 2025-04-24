const express = require('express');
const app = express();

app.get('/data', (req, res) => {
  res.send('✅ Hello from Service B');
});

app.listen(4000, () => {
  console.log('✅ Service B running on http://localhost:4000');
});
