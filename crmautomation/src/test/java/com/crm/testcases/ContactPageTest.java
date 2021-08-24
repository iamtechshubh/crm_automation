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

public class ContactPageTest extends TestBase{

	LoginPage lp;
	HomePage hp;
	TestUtils tu;
	ContactsPage cp;
	
	public ContactPageTest()
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
		tu.switchToFrame();
		cp = hp.clickContactLink();
	}
	
	@Test(priority = 1)
	public void verifyContactsLabel()
	{
		Assert.assertTrue(cp.verifyContactLabel());
	}
	
	@Test(priority = 2)
	public void selectContact()
	{
		cp.selectContacts("Roman Reigns");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
