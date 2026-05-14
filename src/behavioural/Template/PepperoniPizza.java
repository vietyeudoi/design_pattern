package behavioural.Template;

public class PepperoniPizza extends PizzaRecipe {

	@Override
	protected void addSauce() {
		System.out.println("Adding robust, spicy tomato sauce.");
	}

	@Override
	protected void addToppings() {
		System.out.println("Adding shredded mozzarella and thick-cut pepperoni.");
	}
}