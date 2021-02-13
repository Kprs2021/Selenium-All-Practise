package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParamerization {
	
	@Test
	@Parameters("Name")
	public void printname(String name) {
		
		System.out.println("My Name is :"+name);
		
		
	}

}
