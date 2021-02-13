package LoginTestCae_UsingDataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenUsingPOI {

	static List<String> usernameList = new ArrayList<String>();

	static List<String> passwordList = new ArrayList<String>();

	public void readexcel() throws IOException {

		FileInputStream file = new FileInputStream("I:\\DataDriven Tesing\\TestData1.xlsx");
		Workbook workbook = new XSSFWorkbook(file);

//		Sheet sheet = workbook.getSheet("Sheet1");

		Sheet sheet1 = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet1.rowIterator();

		while (rowIterator.hasNext()) {

			Row rowvalue = rowIterator.next();

			Iterator<Cell> coloumnIterator = rowvalue.iterator();
			int i = 2;
			while (coloumnIterator.hasNext()) {

				if (i%2==0) {

					usernameList.add(coloumnIterator.next().getStringCellValue());

				} else {

					passwordList.add(coloumnIterator.next().getStringCellValue());
				}

				i++;
			}

		}

	}

	public void login(String username, String password) {

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

		driver.quit();

	}

	public void executetest() {

		for (int i = 0; i < usernameList.size(); i++) {
			login(usernameList.get(i), passwordList.get(i));

		}

	}

	public static void main(String[] args) throws IOException {

		DataDrivenUsingPOI datadriver = new DataDrivenUsingPOI();
		datadriver.readexcel();
		System.out.println("UserNameList :" + usernameList);
		System.out.println("PasswordList :" + passwordList);
		datadriver.executetest();
		
	}

}
