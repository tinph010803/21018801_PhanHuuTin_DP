package state;

public class ProcessingOrderState implements OrderState {
	 @Override
	    public void handleRequest(OrderContext context) {
	        System.out.println("Đóng gói và vận chuyển.");
	        context.setState(new ShippedOrderState()); // Chuyển sang trạng thái đã giao
	    }
}
