package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {

	String name = "Karthikeyan";
	boolean value = false;
	
	
	@Test
	public void checkequal() {

		/*
		 * if (name.equals("Karthikeyan")) {
		 * System.out.println("Name is equal");
		 * } else {
		 * System.out.println("Name is not equal");
		 * }
		 */
		
//		Assert.assertEquals(name, "Karthikeyan");
//		Assert.assertNotEquals(name, "karthi");
//		Assert.assertTrue(value, "This should not be true");
//		Assert.assertFalse(value, "This should not be true");
		Assert.assertSame(name, "Karthikeyan");
		
		

	}

}
