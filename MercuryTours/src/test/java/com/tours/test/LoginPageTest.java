package com.tours.test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tours.Base.Baseclass;
import com.tours.UiPages.LoginPage;

public class LoginPageTest extends Baseclass
{
	LoginPage login_page;
			
	@Test(dataProvider="logindetails")
	public void login( String un,String pass) throws InterruptedException
	{
	    login_page= new LoginPage(driver);
		login_page.enterloginDetails(un,pass);
		Thread.sleep(3000);
	}
	
	@DataProvider(name="logindetails")
	public Object[][] getData()
	{
		Object data[][]= new Object[1][2];
		data[0][0]="sachin_pink";
		data[0][1]="9172362161";
		return data;
	}

}
