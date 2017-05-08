package com.modular.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.modular.framework.SignIn_Action;

public class Module_TC {
	
	private static WebDriver driver = null;
	 
    public static void main(String[] args) {

    	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.get("http://www.store.demoqa.com");

       // Use your Module SignIn now

       SignIn_Action.Execute(driver);

       System.out.println("Error message should be displayed");

       driver.quit();

    }

}
