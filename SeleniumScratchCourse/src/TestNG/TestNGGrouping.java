package TestNG;

import org.testng.annotations.Test;

public class TestNGGrouping {

	/*
	 * secnario: a big basket is having a different kind of mobiles. let us say
	 * there are apple phones, moto g, vivo and lenovo i want to run tests only for
	 * VIVO and moto phones. write a program for that.
	 */
	@Test(groups = {"apple"})
	public void apple1() {
		System.out.println("Apple Testing");

	}
	@Test(groups = {"apple"})
	public void apple2() {
		System.out.println("Apple Testing");

	}
	@Test(groups = {"motto"})
	public void motto1() {
		System.out.println("Motto Testing");

	}
	@Test(groups = {"motto"})
	public void motto2() {
		System.out.println("Motto Testing");

	}
	@Test(groups = {"vivo"})
	public void vivo1() {
		System.out.println("vivo Testing");

	}
	@Test(groups = {"vivo"})
	public void vivo2() {
		System.out.println("vivo Testing");

	}
	@Test(groups = {"lenovo"})
	public void lenovo1() {
		System.out.println("lenovo Testing");

	}
	@Test(groups = {"lenovo"})
	public void lenovo2() {
		System.out.println("lenovo Testing");

	}

}
