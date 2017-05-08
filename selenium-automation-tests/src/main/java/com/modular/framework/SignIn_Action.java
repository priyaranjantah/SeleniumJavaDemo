package com.modular.framework;

import org.openqa.selenium.WebDriver;

import com.pageobjects.Home_Page;
import com.pageobjects.LogIn_Page;

public class SignIn_Action {
	
	 public static void Execute(WebDriver driver){
		 
		   Home_Page.lnk_MyAccount(driver).click(); 
		 
		   LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");
		 
		   LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");
		 
		   LogIn_Page.btn_LogIn(driver).click();
		 
		   }
		 

}
