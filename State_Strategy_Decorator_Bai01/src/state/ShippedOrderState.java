package state;

public class ShippedOrderState implements OrderState {

	@Override
	public void handleRequest(OrderContext context) {
		System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
		context.setState(new CancelledOrderState()); // Hoặc chuyển sang hủy nếu có
	}
}
