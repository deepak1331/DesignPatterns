package creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OutputStreamToBreakSerializedSingleton {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SerializedSingleton instance1 = SerializedSingleton.getInstance();
		SerializedSingleton instance2 = SerializedSingleton.getInstance();

		ObjectOutputStream objectOutputStream = 
				new ObjectOutputStream(new FileOutputStream("abc.txt"));
		objectOutputStream.writeObject(instance1);
		objectOutputStream.close();

		ObjectInputStream objectInputStream = 
				new ObjectInputStream(new FileInputStream("abc.txt"));
		SerializedSingleton instance3 = 
				(SerializedSingleton) objectInputStream.readObject();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());

	}

}
