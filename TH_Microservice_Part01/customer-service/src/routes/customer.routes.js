const express = require('express');
const router = express.Router();
const controller = require('../controllers/customer.controller');

router.post('/', controller.createCustomer);
router.get('/:id', controller.getCustomer);
router.put('/:id', controller.updateCustomer);
router.delete('/:id', controller.deleteCustomer);

module.exports = router;
