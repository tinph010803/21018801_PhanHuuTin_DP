package state;

public class Main {
	 public static void main(String[] args) {
	        // Khởi tạo thanh toán bằng thẻ tín dụng
	        PaymentContext payment = new PaymentContext(new CreditCardPaymentState());
	        payment.setProcessingFee(5); // Phí xử lý 5$
	        payment.setDiscount(10); // Mã giảm giá 10$
	        payment.processPayment(100); // Thanh toán 100$

	        // Chuyển sang thanh toán bằng PayPal
	        System.out.println("Chuyển phương thức thanh toán sang PayPal...");
	        payment.setPaymentState(new PayPalPaymentState());
	        payment.setProcessingFee(3); // Phí xử lý 3$
	        payment.setDiscount(5); // Mã giảm giá 5$
	        payment.processPayment(200); // Thanh toán 200$
	    }
}
