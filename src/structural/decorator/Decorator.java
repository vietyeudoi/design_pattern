package structural.decorator;

public abstract class Decorator implements Component {
    protected final Component decoratedComponent;

    public Decorator(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public void draw() {
        decoratedComponent.draw();
    }
}
