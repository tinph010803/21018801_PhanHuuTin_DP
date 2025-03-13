package decorator;

public class BasicProduct implements Product{
	 private String name;
	    private double price;

	    public BasicProduct(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public double getPrice() {
	        return price;
	    }

	    @Override
	    public double calculateTax() {
	        return 0; // Mặc định không có thuế
	    }

	    @Override
	    public void displayInfo() {
	        double tax = calculateTax();
	        double finalPrice = price + tax;
	        System.out.println("Sản phẩm: " + name);
	        System.out.println("Giá gốc: " + price);
	        System.out.println("Thuế phải trả: " + tax);
	        System.out.println("Giá sau thuế: " + finalPrice);
	        System.out.println("------------------------");
	    }
}
