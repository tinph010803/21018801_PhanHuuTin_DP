package decorator;

public class ShippingFeeDecorator extends OrderDecorator {
	public ShippingFeeDecorator(Order order) {
        super(order);
    }

    @Override
    public void processOrder() {
        super.processOrder();
        System.out.println("Thêm phí vận chuyển cho đơn hàng.");
    }
}
