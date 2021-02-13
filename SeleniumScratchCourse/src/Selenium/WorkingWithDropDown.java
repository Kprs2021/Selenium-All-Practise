package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// select training program using index.
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		select.selectByValue("3");
		select.selectByVisibleText("Appium");

		// get all the options in the dropdown..
		List<WebElement> alloptions = select.getOptions();
		int size = alloptions.size();
		System.out.println("Number of elements :" + size);

		// you can also use sendkeys to select
		WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"dropdown1\"]"));
		dropdown2.sendKeys("Loadrunner");

		// select multi options in the dropdowns

		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiSelectbox = new Select(multiselect);
		multiSelectbox.selectByIndex(0);
		multiSelectbox.selectByIndex(1);
		multiSelectbox.selectByIndex(2);
		multiSelectbox.selectByIndex(3);
	}

}
