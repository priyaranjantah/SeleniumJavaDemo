package com.common.pageobjects;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.common.utilities.LoadConfigProperties;

public class BaseDriver {
	
	private static final String TEST_DATA_FOLDER = "TestData";
	private static final String FILE_PATH_SEPARATOR = "/";
	protected WebDriver driver;
	protected StringBuffer verificationErrors = new StringBuffer();
	protected Logger log = Logger.getLogger(BaseDriver.class.toString());
	public LoadConfigProperties loadConfig;
	
	public BaseDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement FindElementBy(String element, String how) {

		loadConfig = LoadConfigProperties.getInstance();

		WebElement elementForPage = null;
		String locator = element;
		System.out.println("Test->" + locator);
		try {
			switch (how) {

			case "link_text":
				elementForPage = driver.findElement(By.linkText(locator));
				break;

			case "css":
				elementForPage = driver.findElement(By.cssSelector(locator));
				break;
			case "xpath":
				elementForPage = driver.findElement(By.xpath(locator));
				break;
			case "id":
				elementForPage = driver.findElement(By.id(locator));
				break;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return elementForPage;
	}

	public void clickElement(WebElement element){
		
		element.click();
	}
	
	public void typeText(WebElement element, String text) {

			element.clear();
			element.sendKeys(text);
	}
}
