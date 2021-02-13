package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		
		/*
		 * 1. Need to open chrome browser
		 * 2. going to home page..
		 */
		
		
		System.setProperty("webdriver.chrome.driver","I:\\\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
			
	}

}
