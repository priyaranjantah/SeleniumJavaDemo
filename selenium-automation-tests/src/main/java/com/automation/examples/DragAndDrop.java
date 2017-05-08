package com.automation.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException{
		
		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		  
		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		 
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		 
		WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		 
		WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		
		Thread.sleep(1000);
		
		Actions builder = new Actions(driver);
		 
		Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
		 
		dragAndDrop.perform();
		
//		driver.close();
		
	}

}
