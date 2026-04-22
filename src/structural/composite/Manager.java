package structural.composite;

public class Manager implements Payee{
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("Manager " + name + " được trả " + amount + " USD");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }
}
