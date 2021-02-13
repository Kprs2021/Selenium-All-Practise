package LoginTestCases_usingParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUsername {

	@Test
	@Parameters({"username","password"})
	public void correctusnm(String username,String password) {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement usernm = driver.findElement(By.id("txtUsername"));
		usernm.sendKeys(username);
		WebElement psswrd = driver.findElement(By.id("txtPassword"));
		psswrd.sendKeys(password);
		WebElement submit = driver.findElement(By.id("btnLogin"));
		submit.click();
		String title = driver.getTitle();
		if (title.equals("OrangeHRM")) {

			System.out.println("it's failed");

		} else {

			System.out.println("it's passed");
		}
		System.out.println(title);
		driver.quit();

	}

}
