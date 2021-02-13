package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRole_Page_Objects {
	
	@FindBy(id="menu_admin_viewAdminModule")
	public static WebElement AdminClick;
	
	@FindBy(id="menu_admin_UserManagement")
	public static WebElement usermanagementclick;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	public static WebElement users;
	
	@FindBy(id="searchSystemUser_userType")
	public static WebElement dropdown_userrole;
	
	@FindBy(id="searchSystemUser_status")
	public static WebElement dropdown_status;
	
	@FindBy(id="searchBtn")
	public static WebElement search;
	
	@FindBy(id="searchSystemUser_userName")
	public static WebElement search_username;
	
	@FindBy(xpath="//*[@id=\'resultTable\']/tbody/tr[1]/td[3]")
	public static WebElement verify_admin;
	
	@FindBy(xpath="//*[@id=\'resultTable\']/tbody/tr[1]/td[5]")
	public static WebElement verify_enabled;
	
	
}
