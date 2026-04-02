package Abstract_Factory;

public class BikeRoadFactory implements BikeAbstractFactory{
    @Override
    public Frame createFrame() {
        return new RoadFrame();
    }

    @Override
    public Wheel createWheel() {
        return new RoadWheel();
    }
}
