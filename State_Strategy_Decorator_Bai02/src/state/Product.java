package state;

public class Product {
	private String name;
    private double price;
    private TaxState taxState;
    // Constructor
    public Product(String name, double price, TaxState taxState) {
        this.name = name;
        this.price = price;
        this.taxState = taxState;
    }

    // Thay đổi trạng thái thuế của sản phẩm
    public void setTaxState(TaxState taxState) {
        this.taxState = taxState;
    }

    // Tính thuế dựa trên trạng thái hiện tại
    public double calculateTax() {
        return taxState.calculateTax(price);
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
