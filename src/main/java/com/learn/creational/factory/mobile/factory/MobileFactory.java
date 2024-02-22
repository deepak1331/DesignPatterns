package com.learn.creational.factory.mobile.factory;

import com.learn.creational.factory.mobile.MobilePhone;
import com.learn.creational.factory.mobile.factory.impl.AndroidPhone;
import com.learn.creational.factory.mobile.factory.impl.IPhone;

public class MobileFactory {

	public static MobilePhone getPhone(String type) {
		if (type.trim().equalsIgnoreCase("android"))
			return new AndroidPhone();
		else if (type.trim().equalsIgnoreCase("iphone"))
			return new IPhone();
		return null;
	}
}
