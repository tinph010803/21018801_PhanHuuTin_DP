package strategy;

public interface PaymentStrategy {
	void processPayment(double amount, double processingFee, double discount);
}
