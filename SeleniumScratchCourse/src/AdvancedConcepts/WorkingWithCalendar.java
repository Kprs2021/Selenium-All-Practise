package AdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalendar {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		//Select 10th day of following month
		WebElement calendarElement = driver.findElement(By.id("datepicker"));
//		calendarElement.sendKeys("01/01/2021"+Keys.ENTER);
		
		calendarElement.click();
		
		////a[normalize-space()='Next']
		//a[@title='Next']
		//date = //a[contains(text(),'10')]
		
		WebElement nextbutton = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
		nextbutton.click();
		
		WebElement date10 = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		date10.click();
		
		
		

	}

}
