package AdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImages {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");

		// Click on this image to go home page

		WebElement imagElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		
		imagElement.click();
		
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a/img")).click();
		
		//Am I Broken Image?
		
		WebElement brokenimg = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		//naturalWidth is "0", if it yes then it will be broken image
		
		if (brokenimg.getAttribute("naturalWidth").equals("0")) {
			
			System.out.println("The image is broken image");
			
		}else {
			
			System.out.println("The image is not broken image");
			
		}
		
		
		
		
		
		
		
		
	}

}
