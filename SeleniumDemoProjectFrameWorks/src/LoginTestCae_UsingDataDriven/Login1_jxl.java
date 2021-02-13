package LoginTestCae_UsingDataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Login1_jxl {
	
//	Step1 1: "FileInputStream" Object createObject pananum.
//	Step1 2: "workbook" method create panni andha object name vachi"getworkbook"method use panni file pass pananum.
//	Step1 3: "Sheet" method use panni workbook.getsheet kuduthu sheet ah confirm pananaum. 0 = sheet1
//	Step1 4: Row count namma edukanum aduku sheet use panni sheet.getrows method kuduthu edukanum.
//	Step1 5: coloumn count namma edukanum aduku sheet use panni sheet.getcoloumns method kuduthu edukanum.
//	Step: 5: 2 MultidimensionalCounter array la excel Column andColumn rowcounts la data store panurom. rowcount -1 ngradhu title RemoveLocalStorageItem panuradukuItem kudukarom.
	
	WebDriver driver;
	
	@BeforeTest
	
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	String [][] data = null;
	
	@DataProvider(name = "loginData")
	public String[][] logindataProvider() throws BiffException, IOException {
		
		data=getExcelData();
		return data;
	}
	
	public String[][] getExcelData() throws BiffException, IOException  {
		
		FileInputStream file = new FileInputStream("I:\\DataDriven Tesing\\TestData.xls");

		Workbook workbook = Workbook.getWorkbook(file);

		Sheet sheet = workbook.getSheet(0);

		int rowcounts = sheet.getRows();

		int coloumncounts = sheet.getColumns();

		
		String testData [][] = new String[rowcounts-1][coloumncounts];

	
		for (int i = 1; i < rowcounts; i++) {
			
			for (int j = 0; j < coloumncounts; j++) {
				
				testData [i-1][j] = sheet.getCell(j, i).getContents();
				
			}
			
		}
		return testData;
	
	}
	
	
	
	@Test(dataProvider ="loginData")
	public void LoginApplication(String username, String password) {

		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement usernm = driver.findElement(By.id("txtUsername"));
		usernm.sendKeys(username);
		WebElement psswrd = driver.findElement(By.id("txtPassword"));
		psswrd.sendKeys(password);
		WebElement submit = driver.findElement(By.id("btnLogin"));
		submit.click();
//		String title = driver.getTitle();
//		System.out.println(title);
		
	
	}
	
	@AfterTest
	public void afterTest() {
		
		driver.quit();
		
	}


}
