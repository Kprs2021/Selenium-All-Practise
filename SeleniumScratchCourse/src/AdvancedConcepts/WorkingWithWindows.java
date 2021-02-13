package AdvancedConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		//Click button to open home page in New Window
		String getoldwindow = driver.getWindowHandle();
		System.out.println(getoldwindow);
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		for (String newwindows:handles) {
			
			driver.switchTo().window(newwindows);
			
		}
		
		WebElement newwindoweditElement = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		newwindoweditElement.click();
		driver.close();
		
		driver.switchTo().window(getoldwindow);
		
		
		//Find the number of opened windows:
		
		String oldwindowhandlingString = driver.getWindowHandle();
		
		WebElement multiplewindow = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multiplewindow.click();
		
		int newwindowSethandles = driver.getWindowHandles().size();
		System.out.println("No of windows opened :"+newwindowSethandles);
		
		WebElement dontclose = driver.findElement(By.id("color"));
		dontclose.click();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for (String myallwindow : allwindow) {
			
			if (!myallwindow.equals(getoldwindow)) {
				
				driver.switchTo().window(myallwindow);
				driver.close();
			}
			
			
		}
		
		
	}

}
