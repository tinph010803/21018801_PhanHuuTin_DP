package strategy;

public class NewOrderStrategy implements OrderProcessingStrategy {
	 @Override
	    public void processOrder() {
	        System.out.println("Mới tạo: Kiểm tra thông tin đơn hàng.");
	    }
}
