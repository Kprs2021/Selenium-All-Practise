package PageObjectModeltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//find username, password and submit button



public class LoginPageObjects {

	public WebElement username(WebDriver driver) {

		return driver.findElement(By.id("inputEmail"));

	}

	public WebElement password(WebDriver driver) {

		return driver.findElement(By.id("inputPassword"));

	}
	
	public WebElement robocaptcha(WebDriver driver) {

		return driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div"));

	}

	public WebElement submitbutton(WebDriver driver) {

		return driver.findElement(By.id("login"));

	}

}
