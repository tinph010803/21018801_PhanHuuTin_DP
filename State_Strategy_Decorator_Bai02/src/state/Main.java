package state;

public class Main {
	 public static void main(String[] args) {
	        // Tạo sản phẩm với các trạng thái thuế khác nhau
	        Product product1 = new Product("Bánh quy", 100, new ConsumptionTaxState());
	        Product product2 = new Product("Điện thoại", 500, new VATTaxState());
	        Product product3 = new Product("Túi xách hàng hiệu", 1000, new LuxuryTaxState());

	        // Hiển thị thông tin sản phẩm
	        product1.displayInfo();
	        product2.displayInfo();
	        product3.displayInfo();

	        // Thay đổi trạng thái thuế
	        System.out.println("Thay đổi thuế của điện thoại từ VAT sang thuế xa xỉ...");
	        product2.setTaxState(new LuxuryTaxState());
	        product2.displayInfo();
	    }
}
