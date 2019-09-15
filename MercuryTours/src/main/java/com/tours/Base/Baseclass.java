package com.tours.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Baseclass 
{
	public WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void setup(String browser )
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriber.chrome.driver","C:\\Users\\sachin\\git\\MercuryTours\\MercuryTours\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://newtours.demoaut.com/");
		}
		else
		{
		
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		}
	}
	

}
