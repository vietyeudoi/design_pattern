package Bridge;

public class DropdownButton extends Button{
    public DropdownButton(Size size){
        super(size);
    }
    @Override
    public void draw() {
        System.out.println("Drawing " + size.getSize() + " dropdown button");
    }
}
