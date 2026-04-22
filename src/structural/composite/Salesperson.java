package structural.composite;

public class Salesperson implements Payee {
    private final String name;
    private final Manager manager;

    public Salesperson(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("Salesperson " + name + " được trả " + amount + " USD (Quản lý: " + manager + ")");
    }
}
