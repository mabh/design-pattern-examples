package patterns.structural.decorator;

public class MochaDecorator extends AbstractDecorator {
	public MochaDecorator(final AbstractCoffee coffee) {
		super(coffee);
	}
	
	public double getCost() {
		return 0.25 + getCoffee().getCost();
	}
}
