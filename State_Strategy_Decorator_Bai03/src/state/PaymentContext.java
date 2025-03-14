package state;

public class PaymentContext {
	 private PaymentState paymentState; // Trạng thái hiện tại
	    private double processingFee = 0;
	    private double discount = 0;

	    // Constructor nhận vào trạng thái thanh toán ban đầu
	    public PaymentContext(PaymentState paymentState) {
	        this.paymentState = paymentState;
	    }

	    // Thay đổi trạng thái thanh toán
	    public void setPaymentState(PaymentState paymentState) {
	        this.paymentState = paymentState;
	    }

	    // Thiết lập phí xử lý giao dịch
	    public void setProcessingFee(double fee) {
	        this.processingFee = fee;
	    }

	    // Thiết lập mã giảm giá
	    public void setDiscount(double discount) {
	        this.discount = discount;
	    }

	    // Xử lý thanh toán dựa trên trạng thái hiện tại
	    public void processPayment(double amount) {
	        paymentState.processPayment(amount, processingFee, discount);
	    }
}
