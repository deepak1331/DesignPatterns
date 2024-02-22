package creational.factory;

public class FactoryMain {

	public static void main(String[] args) {

		MobilePhone phone1 = MobileFactory.getPhone("android");

		phone1.type();

		MobilePhone phone2 = MobileFactory.getPhone("iphone");
		phone2.type();
	}

}
