package AdvancedConcepts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDownloadfiles {
	
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");

		//download and verify the downloaded location to the file has properly downloaded or what?
		
		WebElement exceldownload = driver.findElement(By.linkText("Download Excel"));
		exceldownload.click();
		
		Thread.sleep(4000);
		
		//C:\Users\probe7\Downloads
		
		File filelocationFile = new File("C:\\Users\\probe7\\Downloads");
		
		File [] filelistFiles = filelocationFile.listFiles();
		
		for (File file : filelistFiles) {
			
			
		if (file.getName().equals("testleaf.xlsx")) {
			
			System.out.println("File Dowmnloaded Successfully");
			break;
			
		}	
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
