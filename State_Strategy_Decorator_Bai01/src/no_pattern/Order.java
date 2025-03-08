package no_pattern;

public class Order {
	private OrderState state;

	public Order() {
		state = OrderState.NEW; // Mặc định trạng thái ban đầu là Mới tạo
	}

	// Phương thức chuyển trạng thái đơn hàng
	public void changeState(OrderState newState) {
		state = newState;
		System.out.println("Trạng thái đơn hàng đã thay đổi thành: " + state);
	}

	// Phương thức xử lý theo trạng thái
	public void processOrder() {
		switch (state) {
		case NEW:
			System.out.println("Kiểm tra thông tin đơn hàng.");
			break;
		case PROCESSING:
			System.out.println("Đóng gói và vận chuyển.");
			break;
		case SHIPPED:
			System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
			break;
		case CANCELLED:
			System.out.println("Hủy đơn hàng và hoàn tiền.");
			break;
		}
	}
}
