package patterns.observer;

public class Client {
	public static void main(String[] args) {
		ISubject s = new Subject();
		
		IObserver o1 = new Observer();
		IObserver o2 = new Observer();
		IObserver o3 = new Observer();
		
		s.attach(o1);
		s.attach(o2);
		s.attach(o3);
		
		((Subject)s).increment();
		((Subject)s).increment();
		((Subject)s).increment();
		
	}
}
