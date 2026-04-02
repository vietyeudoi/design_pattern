package Prototype;

public class Rabbit implements Cloneable {

    private int age;
    private Person owner;

    public Rabbit(int age , Person owner) {
        this.age = age;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void   setAge(int age) {
        this.age = age;
    }

    public Person getOwner(){
        return owner;
    }

    public void   setOwner(Person o) {
        this.owner = o;
    }

    @Override
    public Rabbit clone() {
        try {
            Rabbit cloned = (Rabbit) super.clone();
            cloned.owner = new Person(owner.getName());
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String toString() {
        return "Rabbit{age=" + age + ", owner=" + owner + "}";
    }

}