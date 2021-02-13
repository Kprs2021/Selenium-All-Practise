package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");

		// Enter email address using send keys
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("test@abc.com");

		// append a text and press keyboard tab
		WebElement appendboxElement = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendboxElement.sendKeys("text");

		// get default text entered
		WebElement getTextBox = driver.findElement(By.name("username"));
		String valueString = getTextBox.getAttribute("value");

		System.out.println(valueString);
		driver.findElement(By.name("username")).getText();

		// cleartext
		WebElement clearBoxElement = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBoxElement.clear();

		// disable edit field
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = disabledbox.isEnabled();
		System.out.println(enabled);

	}

}
