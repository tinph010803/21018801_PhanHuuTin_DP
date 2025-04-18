const express = require('express');
const app = express();
app.use(express.json());

let stock = { item1: 100 };

app.post('/decrement', (req, res) => {
  const { item, quantity } = req.body;
  if (!stock[item] || stock[item] < quantity)
    return res.status(400).json({ error: 'Not enough stock' });

  stock[item] -= quantity;
  res.json({ item, left: stock[item] });
});

app.listen(3002, () => console.log('📦 Inventory Service on 3002'));
