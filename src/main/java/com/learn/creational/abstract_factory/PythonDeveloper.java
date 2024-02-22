package creational.abstract_factory;

public class PythonDeveloper implements Employee {

	@Override
	public int salary() {
		return 45000;
	}

	@Override
	public void role() {
		System.out.println("I'm a Java Developer, I make Rs. "+salary());

	}

}
