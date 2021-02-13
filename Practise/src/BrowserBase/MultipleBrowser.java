package BrowserBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowser {
	
	WebDriver driver;
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
	}
	
	
}
