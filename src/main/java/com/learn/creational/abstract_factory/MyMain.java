package creational.abstract_factory;

public class MyMain {

	public static void main(String[] args) {

		Employee employee = EmployeeFactory.getEmployee(new JavaDeveloperFactory());
		employee.role();

	}

}
