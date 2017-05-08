package com.automation.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) throws InterruptedException{
		
		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/p/mouse-hover.html");
		Thread.sleep(1000);
		 Actions actions = new Actions(driver);
		 WebElement moveonmenu = driver.findElement(By.xpath("//div[@id='menu1']/div"));
		 Thread.sleep(1000);
		 actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("//div[@id='menu1choices']/a"))).click().perform();
 
		driver.close();
		
	}

}
