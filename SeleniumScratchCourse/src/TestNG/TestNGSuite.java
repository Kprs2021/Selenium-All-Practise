package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGSuite {

	// Aim: Open chrome and go to
	// 1. google.co.in 2. bing.com 3. yahoo.com and then close the browser.

	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;

	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		starttime = System.currentTimeMillis();

	}

	@Test
	public void OpenGoogle() {

		driver.get("https://www.google.com/");

	}

	@Test
	public void OpenBing() {

		driver.get("https://www.bing.com/");

	}

	@Test
	public void OpenYahoo() {

		driver.get("https://in.yahoo.com/?p=us");

	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();
		endtime = System.currentTimeMillis();
		totaltime = endtime - starttime;
		System.out.println("Total time taken is :" + totaltime);

	}

}
