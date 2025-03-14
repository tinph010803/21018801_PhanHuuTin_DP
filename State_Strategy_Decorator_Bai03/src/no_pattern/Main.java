package no_pattern;

public class Main {
	 public static void main(String[] args) {
	        // Thanh toán bằng thẻ tín dụng
	        PaymentProcessor creditCardPayment = new PaymentProcessor(PaymentMethod.CREDIT_CARD);
	        creditCardPayment.setProcessingFee(5); // Phí xử lý 5$
	        creditCardPayment.setDiscount(10); // Mã giảm giá 10$
	        creditCardPayment.processPayment(100); // Thanh toán 100$

	        // Thanh toán bằng PayPal
	        PaymentProcessor paypalPayment = new PaymentProcessor(PaymentMethod.PAYPAL);
	        paypalPayment.setProcessingFee(3); // Phí xử lý 3$
	        paypalPayment.setDiscount(5); // Mã giảm giá 5$
	        paypalPayment.processPayment(200); // Thanh toán 200$
	    }
}
