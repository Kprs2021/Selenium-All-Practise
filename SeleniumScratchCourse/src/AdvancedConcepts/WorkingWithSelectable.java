package AdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithSelectable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");

		/*
		 * select first 3 in the list of 7 elements. ctrl+click in selectable, we can
		 * able to select multiple if we click normal, we can only select 1 element..
		 * 
		 * In action class build and perform will always come.
		 * 
		 */

		List<WebElement> selectablElement = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));

		int listsize = selectablElement.size();
		System.out.println(listsize);

		/*
		 * Actions actions = new Actions(driver);
		 * actions.keyDown(Keys.CONTROL).click(selectablElement.get(0)) //Keydown is
		 * using for pressing the key in keyboard like function
		 * .click(selectablElement.get(1))
		 * .click(selectablElement.get(2)).build().perform();
		 * System.out.println("selected multiple select");
		 */
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(selectablElement.get(0));
		actions.clickAndHold(selectablElement.get(1));
		actions.clickAndHold(selectablElement.get(2));
		actions.build().perform();
		
		//we can use click and hold for ctrl functions..
		
	}

}
