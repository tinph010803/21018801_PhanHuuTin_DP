package decorator;

public class GiftWrapDecorator extends OrderDecorator {
	public GiftWrapDecorator(Order order) {
        super(order);
    }

    @Override
    public void processOrder() {
        super.processOrder();
        System.out.println("Đóng gói quà tặng cho đơn hàng.");
    }
}
