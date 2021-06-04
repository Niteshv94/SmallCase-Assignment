/**
 * 
 */
package com.Flipkart.Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Flipkart.Testcases.VerifyLaunchHomePageFlipkart;

/**
 * @author VATS
 *
 */
public class ClickAndPrintItem {

	WebDriver driver;

	public ClickAndPrintItem(WebDriver localdriver) {
		this.driver = localdriver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'DOVE Cream Beauty Bar - Soft, Smooth, Moisturised Skin')]")
	WebElement click_first_item_from_list;

	@FindBy(how = How.XPATH, using = "//div[@class='_30jeq3 _16Jk6d']")
	WebElement get_price_of_item;

	@FindBy(how = How.XPATH, using = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement click_add_to_cart_button;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='+']")
	WebElement increase_quantity_by_one;

	@FindBy(how = How.XPATH, using ="//div[@class='_3LxTgx']")
	WebElement print_updated_price;

	public void click_And_Print_Item() throws Exception {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		
		// It will return the parent window name as a String
		String parentHandle = driver.getWindowHandle();
		
		click_first_item_from_list.click();
		
		 // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle);
		}
		

		String getPrice = get_price_of_item.getText();
		System.out.println("The price of Item is Rs. ======" + getPrice);
		
		Thread.sleep(2000);
		click_add_to_cart_button.click();
		Thread.sleep(4000);
		
		increase_quantity_by_one.click();
		Thread.sleep(2000);

		String getUpdatePrice = print_updated_price.getText();
		System.out.println("The price of Item after adding is Rs. ======" + getUpdatePrice);

	}

}
