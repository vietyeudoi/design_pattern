package Abstract_Factory;

public class Client {
    public static BikeAbstractFactory getBike(BikeType type) {
        switch (type) {
            case MOUNTAIN:
                return new BikeMountainFactory();
            case ROAD:
                return new BikeRoadFactory();
            default:
                throw new IllegalArgumentException("Unknown bike type: " + type);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Creating Mountain Bike ===");
        BikeAbstractFactory mountainFactory = getBike(BikeType.MOUNTAIN);
        Frame mFrame = mountainFactory.createFrame();
        Wheel mWheel = mountainFactory.createWheel();
        mFrame.create();
        mWheel.create();

        System.out.println("\n=== Creating Road Bike ===");
        BikeAbstractFactory roadFactory = getBike(BikeType.ROAD);
        Frame rFrame = roadFactory.createFrame();
        Wheel rWheel = roadFactory.createWheel();
        rFrame.create();
        rWheel.create();
    }
}
