package inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS1 {

	public void doThis() {

		System.out.println("I am from parent class");
		System.out.println("I am from parent class 1");
		System.out.println("I am from parent class 2");
	}
	
	
	public void doThis1() {

		System.out.println("I am from parent class");
		System.out.println("I am from parent class 3");
		System.out.println("I am from parent class 4");
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
