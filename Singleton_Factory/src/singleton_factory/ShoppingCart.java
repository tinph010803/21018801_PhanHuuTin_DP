package singleton_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class ShoppingCart {
	protected List<String> items;

	// Constructor
	public ShoppingCart() {
		items = new ArrayList<>();
	}

	// Thêm sản phẩm vào giỏ hàng
	public void addItem(String item) {
		items.add(item);
		System.out.println(item + " đã được thêm vào giỏ hàng.");
	}

	// Xóa sản phẩm khỏi giỏ hàng
	public void removeItem(String item) {
		if (items.remove(item)) {
			System.out.println(item + " đã được xóa khỏi giỏ hàng.");
		} else {
			System.out.println(item + " không có trong giỏ hàng.");
		}
	}

	// Hiển thị các sản phẩm trong giỏ hàng
	public void showCart() {
		if (items.isEmpty()) {
			System.out.println("Giỏ hàng của bạn đang rỗng.");
		} else {
			System.out.println("Sản phẩm trong giỏ hàng:");
			for (String item : items) {
				System.out.println("- " + item);
			}
		}
	}

	// Phương thức này sẽ được override trong các lớp con nếu có tính năng đặc biệt
	public abstract void specialFeatures();
}
