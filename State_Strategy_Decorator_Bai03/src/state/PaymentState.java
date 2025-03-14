package state;

public interface PaymentState {
	void processPayment(double amount, double processingFee, double discount);
}
