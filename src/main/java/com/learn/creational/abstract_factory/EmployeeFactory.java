package creational.abstract_factory;

public class EmployeeFactory {

	public static Employee getEmployee(EmployeeAbstractFactory abstractEmployeeFactory) {
		return abstractEmployeeFactory.createEmployee();
	}
}
