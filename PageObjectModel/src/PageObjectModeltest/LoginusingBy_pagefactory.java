package PageObjectModeltest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginusingBy_pagefactory {
	
	@FindBy(id = "inputEmail")
	public static WebElement username;
	
	@FindBy(id = "inputPassword")
	public static WebElement password;
	
	@FindBy(id = "login")
	public static WebElement submitbutton;

}
