package creational.singleton;
/**
 * 
 * @author Deepak
 * 
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of the class is created in the static block that provides
 * the option for exception handling.
 * Both eager initialization and static block initialization create the instance
 * even before it’s being used and that is not the best practice to use.
 */
public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
	}

	// static block initialization for exception handling

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Error occurred while creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
