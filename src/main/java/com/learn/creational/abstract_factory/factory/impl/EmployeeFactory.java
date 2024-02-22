package com.learn.creational.abstract_factory.factory.impl;

import com.learn.creational.abstract_factory.factory.Employee;
import com.learn.creational.abstract_factory.factory.EmployeeAbstractFactory;

public class EmployeeFactory {

	public static Employee getEmployee(EmployeeAbstractFactory abstractEmployeeFactory) {
		return abstractEmployeeFactory.createEmployee();
	}
}
