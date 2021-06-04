/**
 * 
 */
package com.Flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author VATS
 *
 */
public class LaunchHomePage  {
	
	WebDriver driver;

	
	public LaunchHomePage(WebDriver localdriver)
	{
		this.driver=localdriver;
	}
	
	@FindBy(how=How.XPATH, using="//button[@class='_2KpZ6l _2doB4z']") 
	WebElement dismiss_login_form;
	
	@FindBy(name="q") 
	WebElement search_box_field;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	WebElement magnifying_lens_icon;
	
	
	
	public void launch_Flipkart_Page(String search_product)
	{
		dismiss_login_form.click();
		search_box_field.sendKeys(search_product);
		magnifying_lens_icon.submit();
	}

}
