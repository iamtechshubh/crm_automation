package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage lp;
	HomePage hp;
	
	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		Intialization();
		lp = new LoginPage();
	}
	
	@Test(priority=2)
	public void loginToCRM()
	{
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void loginPageTitle()
	{
		String title = lp.validatePageTitle();
		Assert.assertEquals(title, "Free CRM  - CRM software for customer relationship management, sales, and support.");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
