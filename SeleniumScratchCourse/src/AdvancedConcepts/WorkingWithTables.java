package AdvancedConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		//get the count of number of coloumns
		
		
		List<WebElement> coloumns= driver.findElements(By.tagName("th"));
		//th - denotes the coloumn name
		int coloumncounts = coloumns.size();
		System.out.println("Number of coloumns :"+coloumncounts);
		
		//get the count of number of rows
		List<WebElement> rows= driver.findElements(By.tagName("tr"));
		//tr - denotes the row name
		int rowcounts = coloumns.size();
		System.out.println("Number of rows :"+rowcounts);
		
		//get the progress value of "learn to interact with elements"
		
		WebElement progressValue = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String getpercentString = progressValue.getText();
		System.out.println("Progression value percentage is :" +getpercentString);
		
		//check the vital task for the least completed progress
		
		List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> storingindividualvalue = new ArrayList<Integer>();
				
		for (WebElement webElement : allprogress) {
			
			String individualvalueString = webElement.getText().replace("%", "");

			storingindividualvalue.add(Integer.parseInt(individualvalueString));
		}
			System.out.println("Final List is :" +storingindividualvalue);	
				
			int smallvalue = Collections.min(storingindividualvalue);
			System.out.println(smallvalue);
			
			////td[normalize-space()='20%']//following::td[1]
			
			String smallvalueString = Integer.toString(smallvalue)+"%";
			
			String finalxpath = "//td[normalize-space()="+"\""+ smallvalueString + "\""+"]"+"//following::td[1]";
	
			System.out.println(finalxpath);
			
			//td[normalize-space()="30%"]//following::td[1]
			
			WebElement check = driver.findElement(By.xpath(finalxpath));
			check.click();
	}

}
