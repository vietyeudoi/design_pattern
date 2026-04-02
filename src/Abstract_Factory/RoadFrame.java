package Abstract_Factory;

public class RoadFrame implements Frame{
    @Override
    public void create(){
        System.out.println("Created Road Bike Frame (lightweight, aerodynamic)");
    }

}
