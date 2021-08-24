package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//td[contains(text(),'User: Shubham Pimple')]")
	WebElement user;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomepageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage clickContactLink()
	{
		contactLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickDealsLink()
	{
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickTasksLink()
	{
		tasksLink.click();
		return new TasksPage();
	}
	
	public boolean verifyUsername()
	{

		return user.isDisplayed();
	}
}
