package CommonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class CommonFunctions1 {
	
	/*
	 * We have to load property file.It means the config file.
	 * 
	 */

	protected static Properties properties = null;
	public static WebDriver driver = null;

	Logger logger = Logger.getLogger(CommonFunctions1.class);

	public Properties loadpropertyfile() throws IOException {

		FileInputStream file = new FileInputStream("config.properties");

		properties = new Properties();
		properties.load(file);

		return properties;

	}

	@BeforeSuite
	@Parameters("browser")
	public void launchbrowser() throws IOException {
		// load property file method calling here

		PropertyConfigurator.configure("log4j.properties");
		logger.info("Orange HRM Test Begins");
		logger.info("Loading the property file");

		loadpropertyfile();

		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driverlocationchrome = properties.getProperty("driverlocationchrome");
		String driverlocationfirefox = properties.getProperty("driverlocationfirefox");
		
		
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", driverlocationchrome);
			logger.info("Launching Chrome");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", driverlocationfirefox);
			logger.info("Launching Firefox");
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		logger.info("Navigating to Application");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void teardown() {
		logger.info("Execution Done..Closing the Browser");
		driver.quit();

	}

}
