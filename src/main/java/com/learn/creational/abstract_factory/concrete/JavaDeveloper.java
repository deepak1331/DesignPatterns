package com.learn.creational.abstract_factory.concrete;

import com.learn.creational.abstract_factory.factory.Employee;

public class JavaDeveloper implements Employee {

	@Override
	public int salary() {
		return 50000;
	}

	@Override
	public void role() {		
		System.out.println("I'm a Java Developer, I make Rs. "+salary());
	}

}
