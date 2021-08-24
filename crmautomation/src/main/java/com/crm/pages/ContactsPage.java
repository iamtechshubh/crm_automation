package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//td[@class='datacardtitle' and contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactLabel()
	{
		return contactsLabel.isDisplayed();
	}
	
	public void selectContacts(String name)
	{
		driver.findElement(By.xpath("//td[@class='datalistrow']/a[contains(text(),'"+name+"')]/../../td/input[@type='checkbox']")).click();
	}
}
