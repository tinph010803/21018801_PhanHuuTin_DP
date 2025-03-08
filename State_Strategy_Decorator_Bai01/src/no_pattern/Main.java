package no_pattern;

public class Main {
	public static void main(String[] args) {
		// Tạo một đơn hàng
		Order order = new Order();

		// Xử lý đơn hàng theo trạng thái
		order.processOrder(); // Kiểm tra thông tin đơn hàng
		order.changeState(OrderState.PROCESSING);
		order.processOrder(); // Đóng gói và vận chuyển
		order.changeState(OrderState.SHIPPED);
		order.processOrder(); // Cập nhật trạng thái đơn hàng là đã giao
		order.changeState(OrderState.CANCELLED);
		order.processOrder(); // Hủy đơn hàng và hoàn tiền
	}
}
