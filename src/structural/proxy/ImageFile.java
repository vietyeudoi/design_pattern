package structural.proxy;

public class ImageFile implements DisplayObject {
    private final String filePath;

    public ImageFile(String filePath) throws InterruptedException {
        this.filePath = filePath;
        load();
    }

    private void load() throws InterruptedException {
        System.out.println("Loading image from disk: " + filePath);
        // Giả lập tải nặng trong 1 giây
        Thread.sleep(1000);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filePath);
    }
}
