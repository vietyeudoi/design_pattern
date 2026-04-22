package structural.decorator;

public class RedBorderComponent extends Decorator {
    public RedBorderComponent(Component decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("--> Add red border");
    }
}
