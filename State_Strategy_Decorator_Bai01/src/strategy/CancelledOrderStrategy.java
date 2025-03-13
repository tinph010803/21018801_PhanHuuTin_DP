package strategy;

public class CancelledOrderStrategy implements OrderProcessingStrategy {
	 @Override
	    public void processOrder() {
	        System.out.println("Hủy: Hủy đơn hàng và hoàn tiền.");
	    }
}
