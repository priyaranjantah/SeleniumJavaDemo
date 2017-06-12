package com.automation.examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	

    public static void main(String[] args) throws InterruptedException {									
        	
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
		driver.get("http://www.yatra.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//li[@id='userSignInStrip']/a")).click();
		
		//click on login button
		driver.findElement(By.id("signInBtn")).click();
		
		//click on signin with facebook button
		driver.findElement(By.id("facebookSignIn")).click();
		
		//Switch to child window
		Set<String> set1=driver.getWindowHandles();
		Iterator <String> win1=set1.iterator();
		String parent=win1.next();
		System.out.println("Parent Window handle: "+ parent);
		String child=win1.next();
		System.out.println("Child Window handle: "+ child);
		Thread.sleep(1000);
		driver.switchTo().window(child);
		
		//Enter username and password in child window
		driver.findElement(By.id("email")).sendKeys("abc@abc.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		
		//Switch to parent window
		driver.switchTo().window(parent);
		//click on register button
		driver.findElement(By.id("signUp")).click();
		
		//close the browser
		driver.quit();
            

}
    
}
