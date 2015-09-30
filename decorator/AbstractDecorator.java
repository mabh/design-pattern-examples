package patterns.structural.decorator;

public abstract class AbstractDecorator extends AbstractCoffee {
	private AbstractCoffee coffee;
	
	public AbstractDecorator(final AbstractCoffee coffee) {
		this.coffee = coffee;
	}
	
	protected AbstractCoffee getCoffee() {
		return this.coffee;
	}
}
