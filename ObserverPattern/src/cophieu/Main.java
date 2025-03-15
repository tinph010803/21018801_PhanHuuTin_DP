package cophieu;

public class Main {
	public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150.0);
        
        Investor investor1 = new Investor("Nguyễn Văn A");
        Investor investor2 = new Investor("Trần Thị B");

        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        System.out.println("Giá cổ phiếu Apple thay đổi:");
        appleStock.setPrice(155.5);

        System.out.println("\nSau khi B ngừng theo dõi:");
        appleStock.removeObserver(investor2);
        appleStock.setPrice(160.0);
    }
}
