package AdvancedConcepts;

import java.beans.beancontext.BeanContextServices;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAutoComplete {

	/*
	 * Auto complete is nothing but, in textbox, when we type any alphabet, it will
	 * display the keywords, which is starting with "" the mentioned alphabet.
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");

		// select webserices in textbox using alphabet "s".

		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		
		Thread.sleep(4000);
		
		List<WebElement> autoElement = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		System.out.println(autoElement.size());
		
		for (WebElement webElement : autoElement) {
			
			String Services = "Web Services";

			if (webElement.getText().equals(Services)) {

				webElement.click();
				System.out.println("Selecting" + webElement.getText());
				break;

			}

		}

	}

}
