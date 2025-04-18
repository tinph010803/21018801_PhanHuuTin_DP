const express = require('express');
const app = express();
app.use(express.json());

app.post('/pay', async (req, res) => {
  // Delay 4 giây để trigger TimeLimiter
  await new Promise(resolve => setTimeout(resolve, 4000));
  res.json({ message: 'Delayed Payment', ...req.body });
});


app.listen(3001, () => console.log('💰 Payment Service on 3001'));
