const express = require('express');
const app = express();
app.use(express.json());

app.post('/ship', (req, res) => {
  const { orderId, address } = req.body;
  res.json({ orderId, status: 'Shipped', address });
});

app.listen(3003, () => console.log('🚚 Shipping Service on 3003'));
