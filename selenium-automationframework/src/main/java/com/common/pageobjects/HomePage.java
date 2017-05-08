package com.common.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends BaseDriver{
	
	@FindBy(how=How.XPATH,using="//li[@id='userSignInStrip']/a")
	private WebElement myAccountLink; 
	
	@FindBy(how=How.ID,using="signInBtn")
	private WebElement loginButton;
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Invoke Login for customer
	public LoginPage goToLoginPage(){
		this.clickElement(myAccountLink);
		this.clickElement(loginButton);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Assert.assertEquals("Yatra Account", driver.getTitle());

		} catch (Error e) {
			System.out.println(e.toString());
		}
	
		return PageFactory.initElements(driver, LoginPage.class);
		
	}

}
