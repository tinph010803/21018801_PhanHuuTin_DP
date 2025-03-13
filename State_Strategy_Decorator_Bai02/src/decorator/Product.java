package decorator;

public interface Product {
	double getPrice(); // Lấy giá gốc
    double calculateTax(); // Tính thuế
    void displayInfo(); // Hiển thị thông tin
}
