package com.automation.examples;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 
		// Storing the Application Url in the String variable
		String url = "http://automationpractice.com";
 
		//Launch the ToolsQA WebSite
		driver.get(url);
		
		//Click on SignIn link
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		//Clear the WebElement
		driver.findElement(By.id("email")).clear();
		
		//Enter UserName and Password
		driver.findElement(By.id("email")).sendKeys("demouser@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("test1234");
		
		//Click on Sign In button
		driver.findElement(By.id("SubmitLogin")).click();
		
		//To check if My Account element is displayed
		boolean myAccountSectionVisible=driver.findElement(By.xpath("//h1[contains(text(),'My account')]")).isDisplayed();
		System.out.println("My Account is visible: "+ myAccountSectionVisible);
		
		//Get the link text
		String linkText=driver.findElement(By.xpath("//div[@id='block_top_menu']/ul//li/a[@title='Dresses']")).getText();
		System.out.println("Link text is: "+ linkText);
		
		//Close Browser
		driver.close();
	}

}
