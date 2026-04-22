package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ImageGallery {
    private final List<DisplayObject> images = new ArrayList<>();

    public void addImage(DisplayObject image) {
        images.add(image);
    }

    public void showAll() throws InterruptedException {
        for (DisplayObject image : images) {
            image.display();
        }
    }
}
