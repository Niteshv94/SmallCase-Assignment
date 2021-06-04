package com.Flipkart.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Flipkart.Utility.BrowserFactory;

public class BaseClass {

	public WebDriver driver;
	
	//public static BrowserFactory factory;

	@BeforeClass
	public void setUp() {

		// This will launch browser and specific url
		driver = BrowserFactory.startBrowser(driver, "Chrome", "https://www.flipkart.com/");	
	
	}
	

	@AfterClass
	public void closeSetup() {
		 //BrowserFactory.quitBrowser(driver);

	}

}
