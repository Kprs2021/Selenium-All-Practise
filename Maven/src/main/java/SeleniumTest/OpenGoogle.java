package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class OpenGoogle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		ExtentSparkReporter reporter = new ExtentSparkReporter("Report.html");
		ExtentReports extendReports = new ExtentReports();
		extendReports.attachReporter(reporter);
		ExtentTest test = extendReports.createTest("Whats up Duck");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Whats up Duck!");
		driver.findElement(By.name("q")).submit();
		test.pass("Test Passed");
		driver.quit();
		extendReports.flush();
		

	}

}
