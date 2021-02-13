package AdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//Advertisements inside the web page are all is frames..
		
		driver.switchTo().frame(0);
		WebElement insideframebutton1 = driver.findElement(By.id("Click"));
		insideframebutton1.click();
		String gettextfranmeString = insideframebutton1.getText();
		System.out.println(gettextfranmeString);
		
		driver.switchTo().defaultContent();		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement insideframebutton2 = driver.findElement(By.id("Click1"));
		insideframebutton2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> framesizeList = driver.findElements(By.tagName("iframe"));
		
		int noofframes = framesizeList.size();
		System.out.println(noofframes);
		
		
		
		
	}

}
