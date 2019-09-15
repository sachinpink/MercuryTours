package com.tours.UiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tours.Base.Baseclass;

public class LoginPage extends Baseclass
{
	 WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement usernameTxt;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwortTxt;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginbtn;
	
	
	public void enterloginDetails(String username, String password)
	{
		usernameTxt.sendKeys(username);
		passwortTxt.sendKeys(password);
		loginbtn.click();
		
		
	}
	
	

}
