package Prototype;

public class Client {

    public static void main(String[] args) {

        Person p1 = new Person("Alice");

        Rabbit r1 = new Rabbit(3, p1);

        Rabbit r2 = r1.clone();

        System.out.println("Original owner: " + r1.getOwner().getName());
        System.out.println("Clone owner: " + r2.getOwner().getName());
    }
}