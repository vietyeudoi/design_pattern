package Bridge;

public class Client {
    public static void main(String[] args) {
        Button btn1 = new CheckboxButton(new SmallSize());
        Button btn2 = new RadioButton(new LargeSize());
        Button btn3 = new DropdownButton(new MediumSize());

        btn1.draw();
        btn2.draw();
        btn3.draw();
    }
}