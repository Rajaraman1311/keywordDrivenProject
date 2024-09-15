package com.seleniumpractice.utilities;

import org.openqa.selenium.By;


public class Locators {
	
	public static By getID(String locator) {
		return By.id(locator);
		
	}
	
	public static By getName(String locator) {
		return By.name(locator);
		
	}
	
	public static By getClass(String locator) {
		return By.className(locator);
		
	}
	
	public static By getLinkText(String locator) {
		return By.linkText(locator);
		
	}
	
	public static By getPartialLinkText(String locator) {
		return By.partialLinkText(locator);
		
	}
	
	public static By getXpath(String locator) {
		return By.xpath(locator);
		
	}
	
	public static By getCssSelectors(String locator) {
		return By.cssSelector(locator);
		
	}

}
