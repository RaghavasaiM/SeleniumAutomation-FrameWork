package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.Log;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() {
	
	Log.info("Starting login test..");	
		LoginPage loginPage = new LoginPage(driver);
		
		Log.info("Adding credentials");
		loginPage.enterUsername("student");
		loginPage.enterPassword("Password123");
		loginPage.clickLogin();
		System.out.println("Title of page is:"+driver.getTitle());
		
		Log.info("Verifying title");
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
	}

	
}
