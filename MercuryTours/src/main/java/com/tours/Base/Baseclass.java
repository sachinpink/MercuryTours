package com.tours.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass 
{
	public WebDriver driver;
	
	String browsers
	="firefox";
	@BeforeClass
	public void setup()
	{
		if(browsers.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else
		{
		
		  driver= new FirefoxDriver();
		
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
