package patterns.structural.decorator;

public class Client {
	public static void main(String[] args) {
		//blend me a house blend with mocha and whip
		System.out.println(new MochaDecorator(new WhipDecorator(new HouseBlendCoffee())).getCost());
		
		//blend me a house blend with whip
		System.out.println(new WhipDecorator(new HouseBlendCoffee()).getCost());
		
		//blend me a decaf with mocha and whip
		System.out.println(new MochaDecorator(new WhipDecorator(new DecafCoffee())).getCost());
		
		//blend me a decaf with mocha
		System.out.println(new MochaDecorator(new DecafCoffee()).getCost());
	}
}
