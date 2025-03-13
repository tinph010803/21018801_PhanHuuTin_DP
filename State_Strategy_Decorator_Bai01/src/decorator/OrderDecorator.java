package decorator;

public abstract class OrderDecorator implements Order {
	protected Order decoratedOrder;

    public OrderDecorator(Order order) {
        this.decoratedOrder = order;
    }

    public void processOrder() {
        decoratedOrder.processOrder();
    }
}
