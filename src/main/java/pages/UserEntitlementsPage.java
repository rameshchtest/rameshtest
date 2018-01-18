package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BirlaVisionWrappers;

public class UserEntitlementsPage extends BirlaVisionWrappers{
	
	public UserEntitlementsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
	/*	if (!verifyTitle("Home")) {
			reportStep("This Not Home Page", "FAIL");
		}*/
	}	

	
	public UserEntitlementsPage clickBankWiseReport_ZM () {

		clickById(prop.getProperty("Admin.UserEntitlementsPage.ZM"));
		return this;
	}
	
	public UserEntitlementsPage clickBankWiseReport_ZM1 () {

		clickById(prop.getProperty("Admin.UserEntitlementsPage.ZM"));
		return this;
	}
	
	public UserEntitlementsPage clickDTSM_Banking () {

		clickById(prop.getProperty("ContentPlaceHolder1_gv_User_Entitlements_04_2"));
		return this;
	}
	public LoginPage clickLogOut() throws InterruptedException {
		
		Thread.sleep(3000);
		clickById(prop.getProperty("HomePage.Logout.ID"));
		return new LoginPage(driver, test);
	}
	
	
	
}
