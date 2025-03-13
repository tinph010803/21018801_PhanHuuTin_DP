package strategy;

public class ProcessingOrderStrategy  implements OrderProcessingStrategy{
	 @Override
	    public void processOrder() {
	        System.out.println("Đang xử lý: Đóng gói và vận chuyển.");
	    }
}
