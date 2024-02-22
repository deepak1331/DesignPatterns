package com.learn.creational.factory.mobile.factory.impl;

import com.learn.creational.factory.mobile.MobilePhone;

public class IPhone implements MobilePhone {
	
	@Override
	public void type() {
		System.out.println("I'm a Apple Phone");
		
	}

}
