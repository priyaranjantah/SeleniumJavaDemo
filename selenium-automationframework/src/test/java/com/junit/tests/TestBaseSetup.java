package com.junit.tests;


import java.io.IOException;

import org.junit.AssumptionViolatedException;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.common.utilities.LoadConfigProperties;



public class TestBaseSetup {

	public static WebDriver driver;
	public static com.common.utilities.LoadConfigProperties loadConfig;
	protected static String baseUrl;
	
	@Rule
	  public TestRule watchman = new TestWatcher() {
	    @Override
	    public Statement apply(Statement base, Description description) {
	    	System.out.println("*****************RUNNING TEST**************************");
	    	System.out.println("********"+description.getMethodName()+"********");
	    	System.out.println("*******************************************************");
	      return super.apply(base, description);
	    }

	    @Override
	    protected void succeeded(Description description) {
	    	System.out.println("*****************SUCCESSFULL EXECUTED**************************");
	    	System.out.println("********"+description.getDisplayName() + "********");
	    	System.out.println("***************************************************************");
	    }

	    @Override
	    protected void failed(Throwable e, Description description) {
	    	System.out.println("*****************FAILED TEST**************************");
	    	System.out.println("**** "+description.getDisplayName() + " " + e.getClass().getSimpleName() + "****\n");
	    	System.out.println("******************************************************");
	    }

	    @Override
	    protected void skipped(AssumptionViolatedException e, Description description) {
	    	System.out.println(description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n");
	    }

	    @Override
	    protected void starting(Description description) {
	      super.starting(description);
	    }

	    @Override
	    protected void finished(Description description) {
	      super.finished(description);
	    }
	  };

	public TestBaseSetup() throws IOException{
		loadConfig = LoadConfigProperties.getInstance();
		baseUrl = loadConfig.getsiteUrl();				


	}

	/**
	 * @return the driver object
	 */
	public WebDriver getDriver(){

		return driver;

	}
	
	@BeforeClass
	public static void setDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}


}
