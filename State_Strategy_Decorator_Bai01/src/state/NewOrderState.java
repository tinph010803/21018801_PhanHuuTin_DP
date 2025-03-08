package state;

public class NewOrderState implements OrderState {
	@Override
	public void handleRequest(OrderContext context) {
		System.out.println("Kiểm tra thông tin đơn hàng.");
		context.setState(new ProcessingOrderState()); // Chuyển sang trạng thái đang xử lý
	}
}
