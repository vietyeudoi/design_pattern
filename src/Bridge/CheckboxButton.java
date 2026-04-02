package Bridge;

public class CheckboxButton extends Button{
    public CheckboxButton(Size size){
        super(size);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + size.getSize() + " checkbox button");
    }
}
