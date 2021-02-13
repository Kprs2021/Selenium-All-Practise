package AdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithSortable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");

		List<WebElement> List = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		WebElement fromElement = List.get(6);
		WebElement toElement = List.get(0);

		Actions actions = new Actions(driver);

//		actions.clickAndHold(fromElement);
//		actions.moveToElement(toElement);
//		actions.release(toElement);
//		actions.build().perform();

		actions.dragAndDrop(fromElement, toElement).build().perform();

	}

}
