package task;

public class Main {
	public static void main(String[] args) {
        Task task1 = new Task("Thiết kế giao diện", "Chưa bắt đầu");

        TeamMember member1 = new TeamMember("Nguyễn Văn A");
        TeamMember member2 = new TeamMember("Trần Thị B");

        task1.addObserver(member1);
        task1.addObserver(member2);

        System.out.println("Cập nhật trạng thái công việc:");
        task1.setStatus("Đang thực hiện");

        System.out.println("\nSau khi B ngừng theo dõi:");
        task1.removeObserver(member2);
        task1.setStatus("Hoàn thành");
    }

}
