package com.learn.creational.abstract_factory;

import com.learn.creational.abstract_factory.concrete.PythonDeveloper;
import com.learn.creational.abstract_factory.factory.Employee;
import com.learn.creational.abstract_factory.factory.impl.EmployeeFactory;
import com.learn.creational.abstract_factory.factory.impl.JavaDeveloperFactory;
import com.learn.creational.abstract_factory.factory.impl.PythonDeveloperFactory;

public class MyMain {

	public static void main(String[] args) {

		Employee employee = EmployeeFactory.getEmployee(new JavaDeveloperFactory());
		employee.role();

		employee = EmployeeFactory.getEmployee(new PythonDeveloperFactory());
		employee.role();

	}

}
