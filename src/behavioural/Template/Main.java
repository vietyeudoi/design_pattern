package behavioural.Template;

public class Main {
	public static void main(String[] args) {
		PizzaRecipe margherita = new MargheritaPizza();
		PizzaRecipe pepperoni = new PepperoniPizza();

		// The exact same method call yields two different recipes
		// without any duplicate structural code!
		margherita.makePizza();
		pepperoni.makePizza();
	}
}