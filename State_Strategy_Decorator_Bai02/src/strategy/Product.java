package strategy;

public class Product {
	 private String name;
	    private double price;
	    private TaxStrategy taxStrategy;

	    // Constructor
	    public Product(String name, double price, TaxStrategy taxStrategy) {
	        this.name = name;
	        this.price = price;
	        this.taxStrategy = taxStrategy;
	    }

	    // Thay đổi chiến lược thuế của sản phẩm
	    public void setTaxStrategy(TaxStrategy taxStrategy) {
	        this.taxStrategy = taxStrategy;
	    }

	    // Tính thuế dựa trên chiến lược hiện tại
	    public double calculateTax() {
	        return taxStrategy.calculateTax(price);
	    }

	    // Hiển thị thông tin sản phẩm
	    public void displayInfo() {
	        double taxAmount = calculateTax();
	        double finalPrice = price + taxAmount;
	        System.out.println("Sản phẩm: " + name);
	        System.out.println("Giá gốc: " + price);
	        System.out.println("Thuế phải trả: " + taxAmount);
	        System.out.println("Giá sau thuế: " + finalPrice);
	        System.out.println("------------------------");
	    }
}
