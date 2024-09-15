package com.seleniumpractice.actionKeywords;

import org.openqa.selenium.WebDriver;
import com.seleniumpractice.engine.Engine;
import com.seleniumpractice.utilities.ExcelUtilities;

public class ActionKeywords {
	
	static WebDriver driver;
	
	public static void openBrowser() {
		
		switch(ExcelUtilities.valueCellValue){
		
		case "chrome":
			/*WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();*/
			System.out.println("Chrome Browser Opened");
			break;
			
		case "firefox":
			System.out.println("Firefox Browser Opened");
			break;
			
		case "explorer":
			System.out.println("IExplorer Browser Opened");
			break;
			
		case "safari":
			System.out.println("Safari Browser Opened");
			break;
			
		}
		
		System.out.println("Broswer opened");
		System.out.println(Engine.locator);
		
	}
	
	public static void goToUrl() {
		
		System.out.println(ExcelUtilities.valueCellValue);
		System.out.println("URL executed");
		System.out.println(Engine.locator);
	}

	public static void enterUserName() {
		
		System.out.println(ExcelUtilities.valueCellValue);
		System.out.println("Username entered");
		System.out.println(Engine.locator);
}

	public static void enterPassword() {
		
		System.out.println(ExcelUtilities.valueCellValue);
		System.out.println("Password entered");
		System.out.println(Engine.locator);
}

	public static void openProfile() {
		
		System.out.println(ExcelUtilities.valueCellValue);
		System.out.println("Profile opened");
		System.out.println(Engine.locator);
		
	}
	
public static void clickOnImage() {
		
		System.out.println(ExcelUtilities.valueCellValue);
		System.out.println("Image clicked");
		System.out.println(Engine.locator);
		
	}

public static void scrollDown() {
	
	System.out.println(ExcelUtilities.valueCellValue);
	System.out.println("Webpage scrolled to down");
	System.out.println(Engine.locator);
	
}

public static void releaseImage() {
	
	System.out.println(ExcelUtilities.valueCellValue);
	System.out.println("Image released");
	System.out.println(Engine.locator);
	
}

public static void quite() {
	
	System.out.println(ExcelUtilities.valueCellValue);
	System.out.println("Browser closed");
	System.out.println(Engine.locator);
	
}	
	
}
