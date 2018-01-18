package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.BirlaVisionWrappers;

public class TC019_User_Entitlements_Page extends BirlaVisionWrappers {
	@BeforeClass
	public void setData() {
		testCaseName =  "TC019_Login";
		testDescription = "Login to Birla and User Entitlements page";
		authors = "RAMESHCH";
		category = "smoke";
		browserName = "chrome";
		dataSheetName = "TC019";
	}
	
	@Test(dataProvider="fetchData")
	public void BirlaLogin(String uName, String pwd,String vName) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin("You have logged in already.")
		.clickUserEntitlements()
		.clickBankWiseReport_ZM()
		.clickBankWiseReport_ZM1()
        .clickDTSM_Banking();
		
	}
	
}
