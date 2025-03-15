package composite;

public class Main {
	 public static void main(String[] args) {
	        Directory root = new Directory("Root");

	        File file1 = new File("Document1.txt", 120);
	        File file2 = new File("Image1.png", 250);

	        Directory subDir1 = new Directory("SubFolder1");
	        File file3 = new File("SubDocument.txt", 100);
	        
	        Directory subDir2 = new Directory("SubFolder2");
	        File file4 = new File("Video.mp4", 1024);

	        subDir1.add(file3);
	        subDir2.add(file4);

	        root.add(file1);
	        root.add(file2);
	        root.add(subDir1);
	        root.add(subDir2);

	        System.out.println("Cấu trúc thư mục:");
	        root.showInfo();
	    }
}
