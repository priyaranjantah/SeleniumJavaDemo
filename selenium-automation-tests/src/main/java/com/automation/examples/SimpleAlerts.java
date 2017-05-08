package com.automation.examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	       driver.get("http://demo.guru99.com/V4/");
	       driver.manage().window().maximize();
   		
           driver.findElement(By.name("uid")).sendKeys("mngr75320");					
           driver.findElement(By.name("password")).sendKeys("YqAzeju");					
           driver.findElement(By.name("btnLogin")).submit();
           driver.findElement(By.linkText("New Customer")).click();
           driver.findElement(By.xpath("//tbody//tr/td[contains(text(),'Customer Name')]/following-sibling::td/input")).sendKeys("Test");
           driver.findElement(By.xpath("//tr/td[contains(text(),'Gender')]/following-sibling::td/input[@value='f']")).click();
           driver.findElement(By.xpath("//tr/td[contains(text(),'Date of Birth')]/following-sibling::td/input[@id='dob']")).sendKeys("04/22/2000");
           driver.findElement(By.xpath("//tr/td[contains(text(),'Address')]/following-sibling::td/textarea")).sendKeys("Address");
           driver.findElement(By.xpath("//tr/td[contains(text(),'City')]/following-sibling::td/input")).sendKeys("City");
           driver.findElement(By.xpath("//tr/td[contains(text(),'State')]/following-sibling::td/input")).sendKeys("State");
           driver.findElement(By.xpath("//tr/td[contains(text(),'PIN')]/following-sibling::td/input")).sendKeys("560008");
           driver.findElement(By.xpath("//tbody//tr/td/input[@name='telephoneno']")).sendKeys("123456789");
           driver.findElement(By.xpath("//tr/td[contains(text(),'E-mail')]/following-sibling::td/input")).sendKeys("a@a.com");
           driver.findElement(By.xpath("//tr/td[contains(text(),'Password')]/following-sibling::td/input")).sendKeys("123456");
           driver.findElement(By.xpath("//input[@value='Submit']")).click();
           
           Thread.sleep(1000);

           // Switching to Alert        
           Alert alert=driver.switchTo().alert();		
           		
           // Capturing alert message.    
           String alertMessage=driver.switchTo().alert().getText();		
           		
           // Displaying alert message		
           System.out.println(alertMessage);			
           		
           // Accepting alert		
           alert.accept();
           
           driver.close();
	}

}
