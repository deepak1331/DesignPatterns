package com.learn.creational.abstract_factory.factory.impl;

import com.learn.creational.abstract_factory.concrete.PythonDeveloper;
import com.learn.creational.abstract_factory.factory.Employee;
import com.learn.creational.abstract_factory.factory.EmployeeAbstractFactory;

public class PythonDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new PythonDeveloper();
	}

}
