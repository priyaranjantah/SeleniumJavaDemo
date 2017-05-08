package com.automation.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 
		// Open ToolsQA web site
		String appUrl = "http://www.DemoQA.com";
		driver.get(appUrl);
		
		Thread.sleep(1000);
		// Click on Registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		
		Thread.sleep(1000);
		// Go back to Home Page
		driver.navigate().back();
 
		Thread.sleep(1000);
		// Go forward to Registration page
		driver.navigate().forward();
 
		Thread.sleep(1000);
		// Go back to Home page
		driver.navigate().to(appUrl);
 
		Thread.sleep(1000);
		// Refresh browser
		driver.navigate().refresh();
 
		// Close browser
		driver.close();
	}
}
