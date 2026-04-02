package Abstract_Factory;

public class BikeMountainFactory implements BikeAbstractFactory{
    @Override
    public Frame createFrame() {
        return new MountainFrame();
    }

    @Override
    public Wheel createWheel() {
        return new MountainWheel();
    }
}
