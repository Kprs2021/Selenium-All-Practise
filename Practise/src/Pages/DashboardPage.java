package Pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import BrowserBase.MultipleBrowser;

public class DashboardPage {
	
	WebDriver driver;
	
	MultipleBrowser browser = new MultipleBrowser();
	By Countrydash = By.cssSelector("input#autosuggest");
	By India = By.id("#ui-id-89");
	
	
	@BeforeTest
	
		
	
	

	@Test	

	public void dashboard() {
		
		driver.findElement(Countrydash).sendKeys("India");
		driver.findElement(India).click();
		
		
		
	}

}
