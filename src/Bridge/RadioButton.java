package Bridge;

public class RadioButton extends Button{
    public RadioButton (Size size){
        super(size);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + size.getSize() + " radio button");
    }
}
