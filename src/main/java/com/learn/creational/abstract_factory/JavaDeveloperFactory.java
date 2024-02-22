package creational.abstract_factory;

public class JavaDeveloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new JavaDeveloper();
	}

}
