package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem {
	private String name;
    private List<FileSystemItem> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    public void remove(FileSystemItem item) {
        children.remove(item);
    }

    @Override
    public void showInfo() {
        System.out.println("Thư mục: " + name);
        for (FileSystemItem item : children) {
            item.showInfo();
        }
    }
}
