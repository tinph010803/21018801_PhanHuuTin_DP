package decorator;

public class Main {
	 public static void main(String[] args) {
	        // Tạo sản phẩm gốc (chưa có thuế)
	        Product product1 = new BasicProduct("Bánh quy", 100);
	        Product product2 = new BasicProduct("Điện thoại", 500);
	        Product product3 = new BasicProduct("Túi xách hàng hiệu", 1000);

	        // Thêm thuế tiêu thụ cho sản phẩm 1
	        Product productWithConsumptionTax = new ConsumptionTaxDecorator(product1);
	        productWithConsumptionTax.displayInfo();

	        // Thêm thuế VAT cho sản phẩm 2
	        Product productWithVAT = new VATTaxDecorator(product2);
	        productWithVAT.displayInfo();

	        // Thêm thuế xa xỉ cho sản phẩm 3
	        Product productWithLuxuryTax = new LuxuryTaxDecorator(product3);
	        productWithLuxuryTax.displayInfo();

	        // Kết hợp thuế VAT + Thuế xa xỉ
	        System.out.println("Áp dụng thuế VAT + Thuế xa xỉ cho điện thoại...");
	        Product productWithVATAndLuxury = new LuxuryTaxDecorator(new VATTaxDecorator(product2));
	        productWithVATAndLuxury.displayInfo();
	    }
}
