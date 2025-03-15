package cophieu;

public class Investor implements Observer {
	private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " nhận thông báo: Giá cổ phiếu " + stockName + " đã thay đổi thành " + price);
    }
}
