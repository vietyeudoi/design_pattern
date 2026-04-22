package structural.decorator;

public class BluePaddingComponent extends Decorator {
    public BluePaddingComponent(Component decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("--> Add blue padding");
    }
}
