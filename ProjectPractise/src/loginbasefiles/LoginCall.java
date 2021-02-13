package loginbasefiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginCall {
	
	
	public static void main(String[] args) {
	
		
	System.setProperty("webdriver.chrome.driver","I:\\New Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
//	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//    Dimension d = new Dimension(1080,300);driver.manage().window().setPosition(new Point(0,0));
////    Resize current window to the set dimension
//    driver.manage().window().setSize(d);
//  DesiredCapabilities caps = new DesiredCapabilities();
//	caps.setCapability("resolution", "1440×900");
	driver.get("https://staging-app.ssricemill.com/ss_factory");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/input")).sendKeys("faadmin");
	driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/input[1]")).sendKeys("2016ssfactory");
	driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector(".desktop_menu_toggle.right_toggle > img")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("li:nth-of-type(3) > .dropdown-toggle.menu_link_responsive.s_menu_click.white_color")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector(".desktop_menu_toggle.right_toggle > img")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("li:nth-of-type(4) > .dropdown-toggle.menu_link_responsive.s_menu_click.white_color")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector(".desktop_menu_toggle.right_toggle > img")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#desktop-menu #setup_link")).click();
	
		}
}