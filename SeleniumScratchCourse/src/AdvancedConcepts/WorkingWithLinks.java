package AdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.leafground.com/pages/Link.html");
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		//Go to Home Page
		
		WebElement homepage = driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		driver.navigate().back();
		
		//Find where am supposed to go without clicking me?
		
		WebElement wheretogo = driver.findElement(By.partialLinkText("Find where"));
		String whereString = wheretogo.getAttribute("href");
		System.out.println("This link's destination is :"+whereString);
		
		//if we inspect the element, in href of the link will show the destination
		//it means the link will be given in the hfref
		
		//Verify am I broken?
		
		WebElement brokenlink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();
		String titleString = driver.getTitle();
		//the title is https is 404 then it will be broken img
		
		if (titleString.contains("404")) {
			
			System.out.println("Link is broken");
			
		}
		
		driver.navigate().back();
		
		WebElement homepages = driver.findElement(By.linkText("Go to Home Page"));
		homepages.click();
		
		driver.navigate().back();
		
		List<WebElement> nooflinks = driver.findElements(By.tagName("a"));
		int totallinks = nooflinks.size();
		System.out.println("Total no of links :"+totallinks);
		
		
	}

}
