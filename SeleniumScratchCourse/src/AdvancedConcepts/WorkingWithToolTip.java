package AdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithToolTip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");

		// Tooltip mouse hover concept.

		WebElement tooltipElement = driver.findElement(By.id("age"));
		// element title, id, tag, name are attribute. we can use attribute method for
		// the elements..

		String tooltipattributetext = tooltipElement.getAttribute("title");
		System.out.println(tooltipattributetext);
		// we must retrieve "title attribute". title is importat to retrieve tooltip.

	}

}
