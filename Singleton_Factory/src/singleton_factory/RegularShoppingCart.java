package singleton_factory;

public class RegularShoppingCart extends ShoppingCart {
	@Override
	public void specialFeatures() {
		System.out.println("Giỏ hàng thông thường: Không có tính năng đặc biệt.");
	}
}
