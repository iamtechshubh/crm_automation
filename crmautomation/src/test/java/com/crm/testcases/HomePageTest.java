package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utils.TestUtils;

public class HomePageTest extends TestBase {

	LoginPage lp;
	HomePage hp;
	TestUtils tu;
	ContactsPage cp;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		Intialization();
		tu = new TestUtils();
		lp = new LoginPage();
		cp = new ContactsPage();
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyhomePageTitle()
	{
		String hpTitle = hp.validateHomepageTitle();
		Assert.assertEquals(hpTitle, "CRMPRO", "Title does not match");
	}
	
	@Test(priority=2)
	public void verifyUserDisplayed()
	{
		tu.switchToFrame();
		Assert.assertTrue(hp.verifyUsername());
	}
	
	@Test(priority=3)
	public void verifyContactsLink()
	{
		tu.switchToFrame();
		cp = hp.clickContactLink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
