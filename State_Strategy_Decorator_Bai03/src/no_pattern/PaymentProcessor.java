package no_pattern;

public class PaymentProcessor {
	private PaymentMethod paymentMethod;
    private double processingFee = 0;  // Phí xử lý giao dịch
    private double discount = 0;       // Mã giảm giá

    // Constructor nhận vào phương thức thanh toán
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Thiết lập phí xử lý giao dịch
    public void setProcessingFee(double fee) {
        this.processingFee = fee;
    }

    // Thiết lập mã giảm giá
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Xử lý thanh toán
    public void processPayment(double amount) {
        double finalAmount = amount;

        // Áp dụng phí xử lý
        if (paymentMethod == PaymentMethod.CREDIT_CARD) {
            System.out.println("Thanh toán bằng Thẻ tín dụng.");
            finalAmount += processingFee; // Ví dụ: Thẻ tín dụng có phí xử lý
        } else if (paymentMethod == PaymentMethod.PAYPAL) {
            System.out.println("Thanh toán bằng PayPal.");
            finalAmount += processingFee; // PayPal cũng có phí xử lý
        }

        // Áp dụng mã giảm giá
        finalAmount -= discount;

        System.out.println("Số tiền cần thanh toán sau khi áp dụng phí và giảm giá: " + finalAmount);
        System.out.println("------------------------");
    }
}
