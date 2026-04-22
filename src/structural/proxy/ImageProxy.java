package structural.proxy;

public class ImageProxy implements DisplayObject {
    private final String filePath;
    private ImageFile realImage;

    public ImageProxy(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void display() throws InterruptedException {
        if (realImage == null) {
            realImage = new ImageFile(filePath);
        }
        realImage.display();
    }
}