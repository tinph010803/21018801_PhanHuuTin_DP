package strategy;

public class PayPalPaymentStrategy implements PaymentStrategy {
	@Override
    public void processPayment(double amount, double processingFee, double discount) {
        double finalAmount = amount + processingFee - discount;
        System.out.println("Thanh toán bằng PayPal.");
        System.out.println("Phí xử lý: " + processingFee);
        System.out.println("Mã giảm giá: " + discount);
        System.out.println("Tổng số tiền phải trả: " + finalAmount);
        System.out.println("------------------------");
    }
}
