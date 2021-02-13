package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCheckBoxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");

		// Select the languages that you know
		WebElement selectlanguagElement = driver
				.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[3]/input"));
		selectlanguagElement.click();

		// Confirm Selenium is checked

		WebElement seleniumselected = driver
				.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean selenium = seleniumselected.isSelected();
		System.out.println(selenium);

		// DeSelect only checked

		WebElement deselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		if (deselect.isSelected()) {
			deselect.click();
		}
	
		WebElement clickelement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));

		if (clickelement.isSelected()) {
			clickelement.click();
		}

	}

}
