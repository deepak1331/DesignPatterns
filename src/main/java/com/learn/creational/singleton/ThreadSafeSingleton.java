package creational.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	/**
	 * A simple way to create a thread-safe singleton class is to make the global
	 * access method synchronized so that only one thread can execute this method at
	 * a time. This works fine and provides thread-safety, but it reduces the
	 * performance because of the cost associated with the synchronized method,
	 * although we need it only for the first few threads that might create separate
	 * instances. *
	 */
	public static synchronized ThreadSafeSingleton getInstanceSlow() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	/**
	 * To avoid this extra overhead every time, double-checked locking principle is
	 * used. In this approach, the synchronized block is used inside the if
	 * condition with an additional check to ensure that only one instance of a
	 * singleton class is created.
	 */
	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				instance = new ThreadSafeSingleton();
			}
		}
		return instance;
	}

}
