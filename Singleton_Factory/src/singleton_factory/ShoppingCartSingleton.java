package singleton_factory;

public class ShoppingCartSingleton {
	private static ShoppingCartSingleton instance;
	private ShoppingCart shoppingCart;

	// Constructor riêng tư để ngăn tạo đối tượng ngoài
	private ShoppingCartSingleton() {
		this.shoppingCart = ShoppingCartFactory.createCart("REGULAR"); // Mặc định là giỏ hàng thông thường
	}

	// Phương thức để lấy thể hiện duy nhất của ShoppingCartSingleton
	public static ShoppingCartSingleton getInstance() {
		if (instance == null) {
			instance = new ShoppingCartSingleton();
		}
		return instance;
	}

	// Lấy giỏ hàng hiện tại
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	// Đổi giỏ hàng (Thông thường -> VIP)
	public void setShoppingCart(String type) {
		this.shoppingCart = ShoppingCartFactory.createCart(type);
	}
}
