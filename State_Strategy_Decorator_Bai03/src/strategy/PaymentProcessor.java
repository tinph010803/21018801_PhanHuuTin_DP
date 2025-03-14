package strategy;

public class PaymentProcessor {
	 private PaymentStrategy paymentStrategy; // Chiến lược thanh toán
	    private double processingFee = 0;  // Phí xử lý giao dịch
	    private double discount = 0;       // Mã giảm giá

	    // Constructor nhận vào chiến lược thanh toán
	    public PaymentProcessor(PaymentStrategy paymentStrategy) {
	        this.paymentStrategy = paymentStrategy;
	    }

	    // Thay đổi chiến lược thanh toán
	    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
	        this.paymentStrategy = paymentStrategy;
	    }

	    // Thiết lập phí xử lý giao dịch
	    public void setProcessingFee(double fee) {
	        this.processingFee = fee;
	    }

	    // Thiết lập mã giảm giá
	    public void setDiscount(double discount) {
	        this.discount = discount;
	    }

	    // Xử lý thanh toán dựa trên chiến lược hiện tại
	    public void processPayment(double amount) {
	        paymentStrategy.processPayment(amount, processingFee, discount);
	    }
}
