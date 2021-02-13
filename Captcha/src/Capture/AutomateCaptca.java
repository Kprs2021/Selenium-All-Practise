package Capture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateCaptca {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://2captcha.com/");
		
		WebElement loginclickElement = driver.findElement(By.linkText("Sign in"));
		loginclickElement.click();
		
		WebElement usernamElement = driver.findElement(By.id("email"));
		usernamElement.sendKeys("kartrakshi2017@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("Kprs@2020");
		
		WebElement clickElement = driver.findElement(By.id("btn_register"));
		clickElement.sendKeys("Kprs@2020");
		
		WebElement startwork = driver.findElement(By.linkText(" StartWork"));
		startwork.click();
		
		
		
		
		
		
		
		
	}

}
