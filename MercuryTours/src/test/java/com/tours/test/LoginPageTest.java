package com.tours.test;
import org.testng.annotations.Test;

import com.tours.Base.Baseclass;
import com.tours.UiPages.LoginPage;

public class LoginPageTest extends Baseclass
{
	Baseclass baseclass=null;
	
	@Test
	public void login()
	{
		LoginPage login_page= new LoginPage(driver);
		login_page.enterloginDetails("sachin","pass");
	}

}
