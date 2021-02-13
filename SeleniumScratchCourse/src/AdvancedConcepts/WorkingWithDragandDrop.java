package AdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.Mouse;

public class WorkingWithDragandDrop {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement From = driver.findElement(By.id("draggable"));
		WebElement To = driver.findElement(By.id("droppable"));
		
		//Mouse actionMouse Interaction, WebDriver neeDriver Actions class
		
		Actions actions = new Actions(driver);
		//actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		actions.dragAndDrop(From, To).build().perform();
		//build and perform methods needs to give otherwise it will not perform.
		
		
		
		
		
		
		
	}

}
