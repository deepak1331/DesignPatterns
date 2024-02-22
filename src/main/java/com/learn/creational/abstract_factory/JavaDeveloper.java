package creational.abstract_factory;

public class JavaDeveloper implements Employee {

	@Override
	public int salary() {
		return 50000;
	}

	@Override
	public void role() {		
		System.out.println("I'm a Java Developer, I make Rs. "+salary());
	}

}
