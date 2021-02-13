package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dahboard_Page_Objects {
	
	@FindBy(xpath="//*[@id='task-list-group-panel-menu_holder']/table/tbody/tr[1]/td/a")
	public static WebElement pendingLeaveRequests;

}
