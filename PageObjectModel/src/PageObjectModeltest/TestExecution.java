package PageObjectModeltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestExecution {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/clientarea.php");
		
		
//		LoginPageObjects loginPageObjects = new LoginPageObjects();
//		loginPageObjects.username(driver).sendKeys("abc@bbc.com");
//		loginPageObjects.password(driver).sendKeys("Kprs@2020");
//		
//		Thread.sleep(2000);
//		loginPageObjects.submitbutton(driver).click();
		
		PageFactory.initElements(driver, LoginusingBy_pagefactory.class);
		
		LoginusingBy_pagefactory.username.sendKeys("abc@bbc.com");
		LoginusingBy_pagefactory.password.sendKeys("Kprs@2020");
		LoginusingBy_pagefactory.submitbutton.click();
		
		
		
		
		
		
		
	}

}
