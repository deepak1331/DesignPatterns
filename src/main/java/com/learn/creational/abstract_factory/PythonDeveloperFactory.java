package creational.abstract_factory;

import org.w3c.dom.views.AbstractView;

public class PythonDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new PythonDeveloper();
	}

}
