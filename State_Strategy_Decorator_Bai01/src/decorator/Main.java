package decorator;

public class Main {
	 public static void main(String[] args) {
	        // Tạo một đơn hàng cơ bản
	        Order basicOrder = new BasicOrder();

	        System.out.println("=== Đơn hàng cơ bản ===");
	        basicOrder.processOrder();

	        System.out.println("\n=== Đơn hàng có phí vận chuyển ===");
	        Order orderWithShipping = new ShippingFeeDecorator(basicOrder);
	        orderWithShipping.processOrder();

	        System.out.println("\n=== Đơn hàng có phí vận chuyển + bảo hiểm ===");
	        Order orderWithShippingAndInsurance = new InsuranceDecorator(orderWithShipping);
	        orderWithShippingAndInsurance.processOrder();

	        System.out.println("\n=== Đơn hàng có phí vận chuyển + bảo hiểm + gói quà ===");
	        Order fullFeaturedOrder = new GiftWrapDecorator(orderWithShippingAndInsurance);
	        fullFeaturedOrder.processOrder();
	    }
}
