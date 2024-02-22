package com.learn.creational.abstract_factory.factory.impl;

import com.learn.creational.abstract_factory.concrete.JavaDeveloper;
import com.learn.creational.abstract_factory.factory.Employee;
import com.learn.creational.abstract_factory.factory.EmployeeAbstractFactory;

public class JavaDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new JavaDeveloper();
	}

}
