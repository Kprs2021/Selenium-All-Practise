package TestNG;

import org.testng.annotations.Test;

public class DriveACar {

	@Test(priority = 0)
	public void startthecar() {

		System.out.println("startthecar");

	}

	@Test(priority = 1)
	public void Putfirstgear() {

		System.out.println("First Gear");

	}

	@Test(priority = 2)
	public void Putsecondgear() {

		System.out.println("Second Gear");

	}

	@Test(priority = 3)
	public void putthirdgear() {

		System.out.println("Third gear");

	}

	@Test(priority = 4)
	public void putfourthgear() {

		System.out.println("Fourth Gear");

	}

}
