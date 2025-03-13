package no_pattern;

public class Product {
	private String name;
	private double price;
	private String taxType; // Loại thuế: "CONSUMPTION", "VAT", "LUXURY"

	// Constructor
	public Product(String name, double price, String taxType) {
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}

	// Phương thức tính thuế dựa trên loại thuế
	public double calculateTax() {
		double tax = 0;

		if ("CONSUMPTION".equalsIgnoreCase(taxType)) {
			tax = price * 0.05; // Thuế tiêu thụ 5%
		} else if ("VAT".equalsIgnoreCase(taxType)) {
			tax = price * 0.10; // Thuế giá trị gia tăng 10%
		} else if ("LUXURY".equalsIgnoreCase(taxType)) {
			tax = price * 0.20; // Thuế xa xỉ 20%
		}

		return tax;
	}

	// Phương thức hiển thị thông tin sản phẩm
	public void displayInfo() {
		double taxAmount = calculateTax();
		double finalPrice = price + taxAmount;
		System.out.println("Sản phẩm: " + name);
		System.out.println("Giá gốc: " + price);
		System.out.println("Loại thuế: " + taxType);
		System.out.println("Thuế phải trả: " + taxAmount);
		System.out.println("Giá sau thuế: " + finalPrice);
		System.out.println("------------------------");
	}
}
