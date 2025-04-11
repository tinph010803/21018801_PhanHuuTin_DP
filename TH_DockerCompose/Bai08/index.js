const express = require('express');
const mysql = require('mysql2');

// Kết nối tới MySQL
const db = mysql.createConnection({
  host: process.env.DB_HOST,
  user: process.env.DB_USER,
  password: process.env.DB_PASSWORD,
  database: process.env.DB_NAME
});

db.connect((err) => {
  if (err) {
    console.error('Không thể kết nối MySQL:', err);
    return;
  }
  console.log('Đã kết nối MySQL');
});

const app = express();
const port = 3000;

// Route đơn giản
app.get('/', (req, res) => {
  res.send('Hello from Node.js!');
});

app.listen(port, () => {
  console.log(`Server đang chạy tại http://localhost:${port}`);
});
