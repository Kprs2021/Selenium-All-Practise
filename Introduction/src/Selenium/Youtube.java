package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.youtube.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("div#search-input > input#search")).sendKeys("vlad and nikita");
	    driver.findElement(By.cssSelector("button#search-icon-legacy")).click();
	    driver.findElement(By.cssSelector("#video-title > yt-formatted-string")).click();
	    

	}

}
