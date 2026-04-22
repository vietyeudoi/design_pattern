package structural.decorator;

public class Client {
    public static void main(String[] args) {
        // Tạo một hình tròn có cả viền đỏ và padding xanh
        Component circle = new BluePaddingComponent(
                                new RedBorderComponent(
                                    new Circle()
                                )
                            );
        
        circle.draw();
    }
}
