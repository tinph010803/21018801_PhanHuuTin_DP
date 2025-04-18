const CircuitBreaker = require('opossum');
const axios = require('axios');

function createBreaker(serviceUrl) {
  const callService = (data) => axios.post(serviceUrl, data);

  const options = {
    timeout: 3000, // nếu service không phản hồi sau 3s → lỗi
    errorThresholdPercentage: 50, // nếu 50% lỗi trong rolling window
    resetTimeout: 10000, // sau 10s sẽ thử lại
  };

  const breaker = new CircuitBreaker(callService, options);

  breaker.fallback(() => {
    return Promise.reject(new Error(`⚠️ ${serviceUrl} is temporarily unavailable.`));
  });

  breaker.on('open', () => console.warn(`🔌 Circuit breaker OPEN for ${serviceUrl}`));
  breaker.on('close', () => console.log(`✅ Circuit breaker CLOSED for ${serviceUrl}`));

  return breaker;
}

module.exports = createBreaker;
