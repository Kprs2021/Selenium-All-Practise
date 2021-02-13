package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
//		Set System Properties
//		webdriver.chrome.driver
//		webdriver.geeko.driver
//		webdriver.ie.driver
		System.setProperty("webdriver.chrome.driver","I:\\chrome driver\\chromedriver_win32\\chromedriver.exe");		
//		Create Driver object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();// it will closes current window
		driver.quit();//it will closes all the windows opened by selenium script.
		

	}

}
