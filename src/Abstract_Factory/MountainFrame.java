package Abstract_Factory;

public class MountainFrame implements Frame{
    @Override
    public void create(){
        System.out.println("Created Mountain Bike Frame (strong, for off-road)");
    }
}
