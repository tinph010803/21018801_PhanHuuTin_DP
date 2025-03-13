package strategy;

public class Main {
	public static void main(String[] args) {
        // Tạo sản phẩm với các chiến lược thuế khác nhau
        Product product1 = new Product("Bánh quy", 100, new ConsumptionTax());
        Product product2 = new Product("Điện thoại", 500, new VATTax());
        Product product3 = new Product("Túi xách hàng hiệu", 1000, new LuxuryTax());

        // Hiển thị thông tin sản phẩm
        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();

        // Thay đổi chiến lược thuế
        System.out.println("Thay đổi thuế của điện thoại từ VAT sang thuế xa xỉ...");
        product2.setTaxStrategy(new LuxuryTax());
        product2.displayInfo();
    }
}
