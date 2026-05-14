package behavioural.Template;

public abstract class PizzaRecipe {

	// THE TEMPLATE METHOD
	// Marked 'final' so the sequence of these steps cannot be altered by subclasses.
	public final void makePizza() {
		System.out.println("--- Starting new pizza order ---");
		makeDough();
		addSauce();
		addToppings();
		bake();
		System.out.println("Pizza is ready!\n");
	}

	// Common Step: Every pizza gets the same dough
	private void makeDough() {
		System.out.println("Rolling out the standard pizza dough.");
	}

	// Common Step: Every pizza bakes exactly the same way
	private void bake() {
		System.out.println("Baking at 400°C for 15 minutes.");
	}

	// Abstract Steps: Subclasses MUST implement these their own way
	protected abstract void addSauce();
	protected abstract void addToppings();
}