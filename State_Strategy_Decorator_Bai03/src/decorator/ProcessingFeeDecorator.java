package decorator;

public class ProcessingFeeDecorator extends PaymentDecorator {
	private double fee;

    public ProcessingFeeDecorator(Payment payment, double fee) {
        super(payment);
        this.fee = fee;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Áp dụng phí xử lý: " + fee);
        super.processPayment(amount + fee);
    }
}
