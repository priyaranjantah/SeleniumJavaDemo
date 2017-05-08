package com.common.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseDriver{
	
	@FindBy(how = How.ID, using = "emailId")
	private WebElement usernameField;

	@FindBy(how = How.ID, using = "password")
	private WebElement passwordField;

	@FindBy(how = How.ID, using = "signInBtn")
	private WebElement signInButton;

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void doLogin(String username, String password) {

		this.typeText(usernameField, username);
		this.typeText(passwordField, password);
		this.clickElement(signInButton);

	}

}
