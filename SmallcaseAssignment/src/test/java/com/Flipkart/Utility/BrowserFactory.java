package com.Flipkart.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.Flipkart.Pages.BaseClass;

public class BrowserFactory extends BaseClass {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(WebDriver driver,String browserName, String url) 
	{
		
		if (browserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
		} 
		else if(browserName.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("IE")) 
		{
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("======Sorry We do not support this browser======");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
