package patterns.observer;

public class Observer implements IObserver {
	public void update(ISubject s) {
		System.out.println(this.hashCode() + ". State is " + s.getState());
	}
}
