package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name="username")
	WebElement Username;

	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignUp;
	

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String username, String password)
	{
		Username.sendKeys(username);
		Password.sendKeys(password);
		LoginBtn.click();
		return new HomePage();
	}
}
