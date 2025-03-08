package state;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = new NewOrderState(); // Khởi tạo trạng thái ban đầu
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void handleRequest() {
        state.handleRequest(this);
    }
}
