package compositeUI;

public class Main {
	public static void main(String[] args) {
        // Tạo thành phần giao diện đơn lẻ
        Button button1 = new Button("Đăng nhập");
        Button button2 = new Button("Đăng ký");
        TextBox textBox1 = new TextBox("Nhập tên đăng nhập");
        TextBox textBox2 = new TextBox("Nhập mật khẩu");

        // Tạo một panel chứa các thành phần
        Panel loginPanel = new Panel("Login Panel");
        loginPanel.add(textBox1);
        loginPanel.add(textBox2);
        loginPanel.add(button1);

        // Tạo một panel chính chứa các panel con
        Panel mainPanel = new Panel("Main Panel");
        mainPanel.add(loginPanel);
        mainPanel.add(button2);

        // Hiển thị toàn bộ giao diện
        System.out.println("Giao diện ứng dụng:");
        mainPanel.render();
    }
}
