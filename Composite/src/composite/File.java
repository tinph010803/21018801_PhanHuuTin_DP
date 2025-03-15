package composite;

public class File implements FileSystemItem {
	private String name;
    private int size; 

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("Tập tin: " + name + " (Kích thước: " + size + "KB)");
    }
}
