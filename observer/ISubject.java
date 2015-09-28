package patterns.observer;

import java.util.List;

public interface ISubject {
	public List<IObserver> getObserverList();
	
	default void attach(IObserver o) {
		getObserverList().add(o);
	}
	
	default void detach(IObserver o) {
		getObserverList().remove(o);
	}
	
	default void notifyObservers(ISubject s) {
		getObserverList().parallelStream().forEach(o -> {
			o.update(s);
		});
	}
	
	public int getState();
}
