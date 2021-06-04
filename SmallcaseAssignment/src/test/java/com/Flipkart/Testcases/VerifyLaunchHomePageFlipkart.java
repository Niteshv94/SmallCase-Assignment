package com.Flipkart.Testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Flipkart.Pages.BaseClass;
import com.Flipkart.Pages.ClickAndPrintItem;
import com.Flipkart.Pages.LaunchHomePage;


public class VerifyLaunchHomePageFlipkart extends BaseClass
{
	String Product="dove soap";

	@Test(priority=1)
	public void navigateToFlipkart() 
	{
		System.out.println("=======Test script Started=========");

		// Created Page Object using Page Factory
		LaunchHomePage launch_home_page = PageFactory.initElements(driver, LaunchHomePage.class);

		// Call the method
		launch_home_page.launch_Flipkart_Page(Product);

	}
	
	@Test(priority=2)
	public void clickOnItemAndPrintPrice()
	{
		ClickAndPrintItem click_on_item=PageFactory.initElements(driver, ClickAndPrintItem.class);
		
		try {
			click_on_item.click_And_Print_Item();
			
		} catch (Exception e) {
		e.getMessage();
		}
		
	}
	

}
