package inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS1 {

	public void doThis() {

		System.out.println("I am from parent class");
	}

	@BeforeMethod
	public void executeFirst() {
		System.out.println("execute me first");
	}

	@AfterMethod
	public void executeLast() {
		System.out.println("execute me last");
	}
}
