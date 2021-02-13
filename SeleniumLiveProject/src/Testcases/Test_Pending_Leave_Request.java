package Testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import CommonFunctions.CommonFunctions1;
import PageObjects.Dahboard_Page_Objects;
import PageObjects.Login_Pageobjects;


public class Test_Pending_Leave_Request extends CommonFunctions1 {

	Logger logger = Logger.getLogger(Test_Pending_Leave_Request.class);

	public void pendingleaverequests() {

		logger.info("Logging to the Application");

		Login_Pageobjects.username.sendKeys(properties.getProperty("username"));
		Login_Pageobjects.password.sendKeys(properties.getProperty("password"));
		Login_Pageobjects.submit.click();
		logger.info("Submitted..");

		String messageString = Dahboard_Page_Objects.pendingLeaveRequests.getText();
		System.out.println(messageString);
		logger.info(messageString);

	}

	@Test
	public void verifyPendingLeaveRequest() {

		PageFactory.initElements(driver, Login_Pageobjects.class);
		PageFactory.initElements(driver, Dahboard_Page_Objects.class);
		pendingleaverequests();
		logger.info("Getting the pending leave Request");

	}

}
