package com.junit.tests;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.common.pageobjects.HomePage;
import com.common.pageobjects.LoginPage;

public class LoginTest extends TestBaseSetup{
	
	HomePage homePage;
	
	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Before
	public void setUp()  throws Exception{
			
		driver=getDriver();
		baseUrl=loadConfig.getsiteUrl();
		homePage=PageFactory.initElements(driver, HomePage.class);
	}
	
	@Test
	public void userCanDoLogin() throws Exception{
		
	driver.get(baseUrl);
	driver.manage().window().maximize();
	LoginPage login=homePage.goToLoginPage();
	login.doLogin("yatrauser@test.com", "test@1234");
		
}
	

	  @AfterClass
	  public static void tearDown() throws Exception {
	    driver.quit();

	  }

}
