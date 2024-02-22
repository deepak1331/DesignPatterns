package creational.singleton;
public class MyMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println(EnumSingleton.INSTANCE);
		
		BillPughSingleton instance = BillPughSingleton.getInstance();
		
		System.out.println(instance.hashCode());

		System.out.println(BillPughSingleton.getInstance().hashCode());
		
		SerializedSingleton instance2 = SerializedSingleton.getInstance();
		SerializedSingleton instance3 = SerializedSingleton.getInstance();
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
		
		
		CloneableSingleton cloneInstance1 = CloneableSingleton.getInstance();
		CloneableSingleton cloneInstance2 = CloneableSingleton.getInstance();

		CloneableSingleton cloneInstance3 = (CloneableSingleton) cloneInstance1.clone();
		

		System.out.println(cloneInstance1.hashCode());
		System.out.println(cloneInstance2.hashCode());
		System.out.println(cloneInstance3.hashCode());		
	}

}
