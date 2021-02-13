package Workings_CsvReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSVReaderWithManualHeader {

		
	   	static String SAMPLE_CSV_FILE_PATH = "I:\\DataDriven Tesing\\sample-project-login-1.csv";
        
	    static WebDriver driver;

	    	
	    public static void main(String[] args) throws IOException, InterruptedException {
	    	
	    	System.setProperty("webdriver.chrome.driver","I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	driver.manage().window().maximize();
	    	driver.get("http://www.leafground.com");
	    	
	        try (
	        
	            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
	            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
	                    .withHeader("Actions", "SelectorType", "Selector", "Value")
	                    .withIgnoreHeaderCase()
	                    .withTrim());
	        ) {
	        	
	            for (CSVRecord csvRecord : csvParser) {
	            	if(csvRecord.getRecordNumber() > 1) {
		                // Accessing values by the names assigned to each column
		                String Actions = csvRecord.get("Actions");
		                String SelectorType = csvRecord.get("SelectorType");
		                String Selector = csvRecord.get("Selector");
		                String Value = csvRecord.get("Value");
		                
		                System.out.println("Record No - " + csvRecord.getRecordNumber());
		                System.out.println("---------------");
		                System.out.println("Actions : " + Actions);
		                System.out.println("SelectorType : " + SelectorType);
		                System.out.println("Selector : " + Selector);
		                System.out.println("Value : " + Value);
		                System.out.println("---------------\n\n");
		                
		                if (Actions.equals(new String("SendKeys"))) {
		                	
		                    if (SelectorType.equals(new String("xpath"))) {
//		                    	System.out.println(SelectorType);
		                    	Thread.sleep(4000);
		                      driver.findElement(By.xpath(Selector)).sendKeys(Value);
		                    } else if (SelectorType.equals(new String("id"))) {
		                      driver.findElement(By.id(Selector)).sendKeys(Value);
		                    }else if (SelectorType.equals(new String("cssSelector"))) {
			                      driver.findElement(By.cssSelector(Selector)).sendKeys(Value);
		                    
		                    }
		                  } else if (Actions.equals(new String("Click"))) {
		                	
		                    if (SelectorType.equals(new String("xpath"))) {
		                      driver.findElement(By.xpath(Selector)).click();
		                      
		                    } else if (SelectorType.equals(new String("id"))) {
		                      driver.findElement(By.id(Selector)).click();
		                    }
		                  } else if (Actions.equals(new String("SelectValue"))) {
		                	  
		                	if(SelectorType.equals(new String("xpath"))) {
		                		Thread.sleep(4000);
		                		WebElement element = driver.findElement(By.xpath(Selector));
		            			Select select1 = new Select(element);
		            			select1.selectByValue(Value);
		                	} else if (SelectorType.equals(new String("id"))) {
		                		Thread.sleep(4000);
		                	 	WebElement element = driver.findElement(By.id(Selector));
		            			Select select1 = new Select(element);
		            			select1.selectByValue(Value);
		  	                }
		                  }  
	            	}
	            }
	        }
	    }
	
		

	

}