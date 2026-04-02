package Abstract_Factory;

public class RoadWheel implements Wheel{
    @Override
    public void create() {
        System.out.println("Created Road Bike Wheel (thin tires, high speed)");
    }
}
