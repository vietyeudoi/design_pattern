package Abstract_Factory;

public class MountainWheel implements Wheel{
    @Override
    public void create(){
        System.out.println("Created Mountain Bike Wheel (thick tires, good grip)");
    }
}
