package decorator;

public class InsuranceDecorator extends OrderDecorator {
	 public InsuranceDecorator(Order order) {
	        super(order);
	    }

	    @Override
	    public void processOrder() {
	        super.processOrder();
	        System.out.println("Thêm bảo hiểm cho đơn hàng.");
	    }
}
