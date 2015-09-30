package patterns.structural.decorator;

public class WhipDecorator extends AbstractDecorator {
	public WhipDecorator(AbstractCoffee coffee) {
		super(coffee);
	}
	
	public double getCost() {
		return 0.10 + getCoffee().getCost();
	}
}
