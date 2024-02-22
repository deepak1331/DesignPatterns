package com.learn.creational.factory;

import com.learn.creational.factory.mobile.MobilePhone;
import com.learn.creational.factory.mobile.factory.MobileFactory;

public class FactoryMain {

	public static void main(String[] args) {

		MobilePhone phone1 = MobileFactory.getPhone("android");

		phone1.type();

		MobilePhone phone2 = MobileFactory.getPhone("iphone");
		phone2.type();
	}

}
