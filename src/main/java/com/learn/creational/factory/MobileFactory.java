package creational.factory;

public class MobileFactory {

	public static MobilePhone getPhone(String type) {
		if (type.trim().equalsIgnoreCase("android"))
			return new AndroidPhone();
		else if (type.trim().equalsIgnoreCase("iphone"))
			return new IPhone();
		return null;
	}
}
