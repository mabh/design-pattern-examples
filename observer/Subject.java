package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

	private int state;
	private List<IObserver> list = new ArrayList<>();	
	
	public List<IObserver> getObserverList() {
		return this.list;
	}

	public void increment() {
		this.state++;
		
		//injectable via AOP
		notifyObservers(this);
	}
	
	public void decrement() {
		this.state--;
		
		//injectable via AOP
		notifyObservers(this);
	}
	
	public int getState() {
		return this.state;
	}
}
