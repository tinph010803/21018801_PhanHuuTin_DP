package decorator;

public class DiscountDecorator extends PaymentDecorator {
	 private double discount;

	    public DiscountDecorator(Payment payment, double discount) {
	        super(payment);
	        this.discount = discount;
	    }

	    @Override
	    public void processPayment(double amount) {
	        System.out.println("Áp dụng mã giảm giá: " + discount);
	        super.processPayment(amount - discount);
	    }
}
