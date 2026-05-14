package behavioural.Iterator;

public class Client {
    public static void main(String[] args) {
        Inventory warehouse = new Inventory();

        warehouse.addItem(new Item("Laptop", true));
        warehouse.addItem(new Item("Graphics Card", false)); // Out of stock
        warehouse.addItem(new Item("Mechanical Keyboard", true));
        warehouse.addItem(new Item("Gaming Mouse", false));  // Out of stock
        warehouse.addItem(new Item("Monitor", true));

        System.out.println("--- Available Items in Warehouse ---");

        // Because Inventory implements Iterable and returns InStockIterator,
        // this standard for-each loop will automatically skip out-of-stock items!
        for (Item item : warehouse) {
            System.out.println("Available: " + item.getName());
        }
    }
}
