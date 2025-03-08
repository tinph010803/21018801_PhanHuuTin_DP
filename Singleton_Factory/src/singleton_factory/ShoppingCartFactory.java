package singleton_factory;

public class ShoppingCartFactory {
	// Factory Method để tạo giỏ hàng
	public static ShoppingCart createCart(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("REGULAR")) {
			return new RegularShoppingCart();
		} else if (type.equalsIgnoreCase("VIP")) {
			return new VIPShoppingCart();
		}
		return null;
	}
}
