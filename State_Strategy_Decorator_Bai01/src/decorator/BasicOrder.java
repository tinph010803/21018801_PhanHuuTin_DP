package decorator;

public class BasicOrder  implements Order{
	  @Override
	    public void processOrder() {
	        System.out.println("Xử lý đơn hàng cơ bản.");
	    }
}
