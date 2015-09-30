package patterns.structural.decorator;

public class WhipDecorator extends AbstractDecorator {
	private final AbstractCoffee coffee;

	public WhipDecorator(AbstractCoffee coffee) {
		this.coffee = coffee;
	}
	
	public double getCost() {
		return 0.10 + this.coffee.getCost();
	}
}
