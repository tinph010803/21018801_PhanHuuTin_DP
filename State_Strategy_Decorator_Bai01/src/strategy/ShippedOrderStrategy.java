package strategy;

public class ShippedOrderStrategy implements OrderProcessingStrategy {
	@Override
    public void processOrder() {
        System.out.println("Đã giao: Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
