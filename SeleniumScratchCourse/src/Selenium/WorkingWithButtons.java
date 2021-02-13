package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//Find position of button (x,y)
		WebElement getPositionElement = driver.findElement(By.id("position"));
		Point xyPoint = getPositionElement.getLocation();
		int xValue = xyPoint.getX();
		int yValue = xyPoint.getY();
		System.out.println("X Value is :"+xValue + "Y Value is:"+yValue);
		
		//Find button color
		WebElement findcolor = driver.findElement(By.id("color"));
		String buttoncolor = findcolor.getCssValue("background-color");
		System.out.println("Button color is :"+buttoncolor);
		
		//Find the height and width
		WebElement sizebutton = driver.findElement(By.id("size"));
		int height = sizebutton.getSize().getHeight();
		int width = sizebutton.getSize().getWidth();
		System.out.println("Height is :"+height+"Width is :"+width);
		
		WebElement homeis = driver.findElement(By.id("home"));
		homeis.click();
		
		
		
		
	}

}
