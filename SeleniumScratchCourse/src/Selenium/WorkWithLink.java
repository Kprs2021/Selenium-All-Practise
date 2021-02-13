package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkWithLink {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "I:\\\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		//Clicking links using linktext
		//driver.findElement(By.linkText("Go to Home Page")).click();
		//Clicking links using partiallinktext
		driver.findElement(By.partialLinkText("Home Page")).click();
		
	}

}
