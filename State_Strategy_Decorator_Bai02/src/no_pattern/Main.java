package no_pattern;

public class Main {
	 public static void main(String[] args) {
	        // Tạo một số sản phẩm với các loại thuế khác nhau
	        Product product1 = new Product("Bánh quy", 100, "CONSUMPTION");
	        Product product2 = new Product("Điện thoại", 500, "VAT");
	        Product product3 = new Product("Túi xách hàng hiệu", 1000, "LUXURY");

	        // Hiển thị thông tin sản phẩm
	        product1.displayInfo();
	        product2.displayInfo();
	        product3.displayInfo();
	    }
}
