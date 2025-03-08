package singleton_factory;

public class Main {
	public static void main(String[] args) {
		// Lấy thể hiện duy nhất của ShoppingCartSingleton
		ShoppingCartSingleton cartSingleton = ShoppingCartSingleton.getInstance();

		// Tạo giỏ hàng thông thường
		ShoppingCart cart1 = cartSingleton.getShoppingCart();
		cart1.addItem("Laptop");
		cart1.addItem("Điện thoại");
		System.out.println("----------------------------------");

		cart1.showCart();
		cart1.specialFeatures();

		System.out.println("----------------------------------");

		// Đổi giỏ hàng thành giỏ hàng VIP
//		cartSingleton.setShoppingCart("VIP");
		ShoppingCart cart2 = cartSingleton.getShoppingCart();

		cart2.addItem("Smartwatch");
		cart2.addItem("Tai nghe");
		cart2.showCart();
		cart2.specialFeatures();

		System.out.println("----------------------------------");

		// Kiểm tra xem cart1 và cart2 có giống nhau không (Cùng tham chiếu vào một đối
		// tượng)
		System.out.println("cart1 và cart2 có phải là đối tượng giống nhau không? " + (cart1 == cart2));
	}
}
