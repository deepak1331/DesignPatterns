package creational.singleton;

public class CloneableSingleton implements Cloneable {

	private static CloneableSingleton instance;

	private CloneableSingleton() {
	}

	public static CloneableSingleton getInstance() {
		if (instance == null)
			instance = new CloneableSingleton();
		return instance;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//return super.clone();
		//return the getInsance method here to overcome this problem
		return getInstance();
	}

}
