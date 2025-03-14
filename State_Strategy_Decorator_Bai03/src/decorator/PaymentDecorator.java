package decorator;

public abstract class PaymentDecorator implements Payment {
	protected Payment decoratedPayment;

    public PaymentDecorator(Payment payment) {
        this.decoratedPayment = payment;
    }

    @Override
    public void processPayment(double amount) {
        decoratedPayment.processPayment(amount);
    }
}
