package structural.proxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        ImageGallery gallery = new ImageGallery();

        gallery.addImage(new ImageProxy("img1.jpg"));
        gallery.addImage(new ImageProxy("img2.jpg"));
        gallery.addImage(new ImageProxy("img3.jpg"));

        System.out.println("Gallery created. No image loaded yet.\n");

        gallery.showAll();
    }
}