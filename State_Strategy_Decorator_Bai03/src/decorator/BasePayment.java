package decorator;

public class BasePayment implements Payment {
	private String method; // Phương thức thanh toán (Credit Card, PayPal)

    public BasePayment(String method) {
        this.method = method;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán bằng: " + method);
        System.out.println("Số tiền phải trả: " + amount);
        System.out.println("------------------------");
    }
}
