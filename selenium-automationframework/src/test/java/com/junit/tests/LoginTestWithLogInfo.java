package com.junit.tests;

import java.io.IOException;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.common.pageobjects.HomePage;
import com.common.pageobjects.LoginPage;

public class LoginTestWithLogInfo extends TestBaseSetup{
	
	HomePage homePage;
	
	private static final Logger LOGGER = Logger.getAnonymousLogger();
	
	public LoginTestWithLogInfo() throws IOException {
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
	LOGGER.info("Create login class object and click on my account link...");
	LoginPage login=homePage.goToLoginPage();
	LOGGER.info("Enter credentials....");
	login.doLogin("yatrauser@test.com", "test@1234");
	LOGGER.info("Logged in successful....");	
}
	

	  @AfterClass
	  public static void tearDown() throws Exception {
	    driver.quit();

	  }

}
