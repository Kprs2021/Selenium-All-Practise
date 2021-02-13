package AdvancedConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithUploadFile {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");

		// upload file

		WebElement uploadfile = driver.findElement(By.name("filename"));
		uploadfile.click();

		// control moved to windows
		// C:\\Users\\probe7\\Downloads\\testleaf.xlsx

		String File = "C:\\Users\\probe7\\Downloads\\testleaf.xlsx";

		StringSelection selection = new StringSelection(File);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		//windows based work robot will help to achieve all functions like actions in webdriver.
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
