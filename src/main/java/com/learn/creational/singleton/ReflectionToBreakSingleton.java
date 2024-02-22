package creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionToBreakSingleton {

	public static void main(String[] args) {

		ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance3 = null;

		try {
			Constructor[] constructors = ThreadSafeSingleton.class.getDeclaredConstructors();
			for (Constructor c : constructors) {
				c.setAccessible(true);
				instance3 = (ThreadSafeSingleton) c.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());		
		System.out.println(instance3.hashCode());		
	}
}
