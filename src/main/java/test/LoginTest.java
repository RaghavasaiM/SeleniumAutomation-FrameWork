package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.Log;

public class LoginTest extends BaseTest {

	@Test
	public void testValidLogin() {

		Log.info("Starting login test..");
		test = ExtentReportManager.createTest("Login test");
		
		test.info("Navigatingg to URL");
		LoginPage loginPage = new LoginPage(driver);

		Log.info("Adding credentials");
		test.info("Adding credentials");
		loginPage.enterUsername("student");
		loginPage.enterPassword("Password123");
		
		test.info("Clicking on Login button");
		loginPage.clickLogin();
		System.out.println("Title of page is:" + driver.getTitle());

		Log.info("Verifying page title");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
		
		test.pass("Login Successful");
	}
	
	@Test
	public void testValidWithInvalidLogin() {

		Log.info("Starting login test..");
		test = ExtentReportManager.createTest("Login test with Invalid Creds");
		
		test.info("Navigatingg to URL");
		LoginPage loginPage = new LoginPage(driver);

		Log.info("Adding credentials");
		test.info("Adding credentials");
		loginPage.enterUsername("student123");
		loginPage.enterPassword("Password123");
		
		test.info("Clicking on Login button");
		loginPage.clickLogin();
		System.out.println("Title of page is:" + driver.getTitle());

		Log.info("Verifying page title");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
		
		test.pass("Login Successful");
	}

}
