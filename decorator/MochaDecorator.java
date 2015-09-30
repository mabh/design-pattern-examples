package patterns.structural.decorator;

public class MochaDecorator extends AbstractDecorator {
	private final AbstractCoffee coffee;
	
	public MochaDecorator(AbstractCoffee coffee) {
		this.coffee = coffee;
	}
	
	public double getCost() {
		return 0.25 + this.coffee.getCost();
	}
}
