package Testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions1;
import PageObjects.UserRole_Page_Objects;

public class Test_User_Role extends CommonFunctions1 {
	
	Logger logger = Logger.getLogger(Test_User_Role.class);

	public void MoveToUserPage() {

		Actions actions = new Actions(driver);
		actions.moveToElement(UserRole_Page_Objects.AdminClick);
		actions.moveToElement(UserRole_Page_Objects.usermanagementclick);
		actions.moveToElement(UserRole_Page_Objects.users);
		actions.click().build().perform();
		logger.info("Users has been clicked Successfully");
	}

	public void selectUserRole() {

		Select selectuserrole = new Select(UserRole_Page_Objects.dropdown_userrole);
		selectuserrole.selectByIndex(1);
		logger.info("Selecting the Admin");
		
	}

	public void selectUserstatus() {

		Select selectuserstatus = new Select(UserRole_Page_Objects.dropdown_status);
		selectuserstatus.selectByIndex(1);
		logger.info("Selecting the Enabled");
		UserRole_Page_Objects.search.click();
		logger.info("Enabled has been clicked Successfully");

	}

	@Test
	public void checkuserrole() {

		PageFactory.initElements(driver, UserRole_Page_Objects.class);
		MoveToUserPage();
		selectUserRole();
		selectUserstatus();

		String actualroleString = UserRole_Page_Objects.verify_admin.getText();
		String actualstatus = UserRole_Page_Objects.verify_enabled.getText();

		Assert.assertEquals(actualroleString, "Admin");
		Assert.assertEquals(actualstatus, "Enabled");
		logger.info("End of Testing..");

	}

}
