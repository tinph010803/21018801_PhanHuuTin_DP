package state;

public class OrderStateExample {
	public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();

        // Quản lý trạng thái đơn hàng
        orderContext.handleRequest(); // Kiểm tra thông tin đơn hàng (Mới tạo)
        System.out.println("===================================");
        orderContext.handleRequest(); // Đóng gói và vận chuyển (Đang xử lý)
        System.out.println("===================================");
        orderContext.handleRequest(); // Cập nhật trạng thái đơn hàng là đã giao (Đã giao)
        System.out.println("===================================");
        orderContext.handleRequest(); // Hủy đơn hàng và hoàn tiền (Hủy)
    }
}
