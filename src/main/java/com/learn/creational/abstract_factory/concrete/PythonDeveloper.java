package com.learn.creational.abstract_factory.concrete;

import com.learn.creational.abstract_factory.factory.Employee;

public class PythonDeveloper implements Employee {

	@Override
	public int salary() {
		return 45000;
	}

	@Override
	public void role() {
		System.out.println("I'm a Python Developer, I make Rs. "+salary());

	}

}
