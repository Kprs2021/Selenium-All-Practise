package TestNG;

import org.testng.annotations.Test;

public class DependenciesManagement {

	// Problem:1 You have to admit a student to engineering
	// Problem:2 You have to admit a student to higher secondary

	@Test(enabled = true)
	public void tenth() {

		System.out.println("High school");

	}

	@Test(dependsOnMethods ="tenth")
	public void highersecondary() {

		System.out.println("Higher secondary school");

	}

	@Test(dependsOnMethods ="highersecondary")
	public void engineering() {

		System.out.println("Engineering College");

	}

}
