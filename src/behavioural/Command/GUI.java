package behavioural.Command;

public class GUI {
    public static void main(String[] args) {
        Document doc = new Document();

        Button saveButton = new Button();
        Button printButton = new Button();

        saveButton.setCommand(new SaveCommand(doc));
        printButton.setCommand(new PrintCommand(doc));

        // Simulate button clicks
        saveButton.click();  // Output: Document saved!
        printButton.click(); // Output: Document printed!
    }
}
