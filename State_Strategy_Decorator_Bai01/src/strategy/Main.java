package strategy;

public class Main {
	public static void main(String[] args) {
		 Order order = new Order(new NewOrderStrategy());
	        order.processOrder();  // Mới tạo: Kiểm tra thông tin đơn hàng

	        // Chuyển trạng thái sang "Đang xử lý"
	        order.setOrderProcessingStrategy(new ProcessingOrderStrategy());
	        order.processOrder();  // Đang xử lý: Đóng gói và vận chuyển

	        // Chuyển trạng thái sang "Đã giao"
	        order.setOrderProcessingStrategy(new ShippedOrderStrategy());
	        order.processOrder();  // Đã giao: Cập nhật trạng thái đơn hàng là đã giao

	        // Chuyển trạng thái sang "Hủy"
	        order.setOrderProcessingStrategy(new CancelledOrderStrategy());
	        order.processOrder();  // Hủy: Hủy đơn hàng và hoàn tiền
	}
}
