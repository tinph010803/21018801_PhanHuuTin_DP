package singleton_factory;

public class VIPShoppingCart extends ShoppingCart {
	@Override
	public void specialFeatures() {
		System.out.println("Giỏ hàng VIP: Giảm giá 10% cho mọi sản phẩm.");
	}
}
