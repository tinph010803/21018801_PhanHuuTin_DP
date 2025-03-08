package state;

public class CancelledOrderState implements OrderState{
	@Override
    public void handleRequest(OrderContext context) {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
        context.setState(new NewOrderState()); // Quay lại trạng thái mới
    }
}
