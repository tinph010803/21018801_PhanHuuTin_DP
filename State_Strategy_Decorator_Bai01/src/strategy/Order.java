package strategy;

public class Order {
	  private OrderProcessingStrategy orderProcessingStrategy;

	    // Constructor nhận vào chiến lược xử lý ban đầu
	    public Order(OrderProcessingStrategy orderProcessingStrategy) {
	        this.orderProcessingStrategy = orderProcessingStrategy;
	    }

	    // Cho phép thay đổi chiến lược xử lý
	    public void setOrderProcessingStrategy(OrderProcessingStrategy orderProcessingStrategy) {
	        this.orderProcessingStrategy = orderProcessingStrategy;
	    }

	    // Gọi phương thức xử lý của chiến lược hiện tại
	    public void processOrder() {
	        orderProcessingStrategy.processOrder();
	    }
}
