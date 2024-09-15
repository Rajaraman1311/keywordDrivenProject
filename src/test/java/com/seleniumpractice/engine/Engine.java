package com.seleniumpractice.engine;

import java.lang.reflect.Method;

import org.openqa.selenium.By;

import com.seleniumpractice.actionKeywords.ActionKeywords;
import com.seleniumpractice.constants.Constants;
import com.seleniumpractice.utilities.ExcelUtilities;
import com.seleniumpractice.utilities.Locators;

public class Engine {
	
	public static String actionCellValue;
	public static ActionKeywords actionKeywords;
	public static int actionKeywordColumnNo = 0;
	public static int valueColumnNo = actionKeywordColumnNo + 1;
	public static int locatorsColumnNo = actionKeywordColumnNo + 2;
	public static Method[] methods;
	public static By locator;
	
	

		
		public static void collectKeywordsFromActionKeywordsClass() {
			actionKeywords = new ActionKeywords();
			methods = actionKeywords.getClass().getMethods();
			}
			
			public static void executeKeywords(){
				
				collectKeywordsFromActionKeywordsClass();
				for(int i=0; i<methods.length; i++) {
					if(methods[i].getName().equalsIgnoreCase(ExcelUtilities.actionCellValue)) {
						try {
							methods[i].invoke(ExcelUtilities.actionCellValue);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
						//methods[i].invoke(actionKeywords);
						break;
					}
				}
				
			}
			
			private static void elementToBeUsed() {
				// TODO Auto-generated method stub
				switch(ExcelUtilities.loctorID) {
				
				case Constants.ID: 
					locator = Locators.getID(ExcelUtilities.locatorValue);
					break;
					
				case Constants.NAME:
					locator = Locators.getName(ExcelUtilities.locatorValue);
					break;
					
				case Constants.CLASS_NAME:
					locator = Locators.getClass(ExcelUtilities.locatorValue);
					break;
					
				case Constants.XPATH:
					locator = Locators.getXpath(ExcelUtilities.locatorValue);
					break;
					
				case Constants.LIKED_TEXT:
					locator = Locators.getLinkText(ExcelUtilities.locatorValue);
					break;
					
				case Constants.PARTIAL_LINK_TEXT:
					locator = Locators.getPartialLinkText(ExcelUtilities.locatorValue);
					break;
					
				case Constants.CSS_SELECTORS:
					locator = Locators.getCssSelectors(ExcelUtilities.locatorValue);
					break;
					
				}
			}
			
			public static void main(String[] args) throws Exception {
				ExcelUtilities.excelReader();
				for(int rowNo =1; rowNo<=ExcelUtilities.rowCount; rowNo++) {
				//actionCellValue = 
				ExcelUtilities.readExcelValue(rowNo, actionKeywordColumnNo, valueColumnNo, locatorsColumnNo);
				elementToBeUsed();
				executeKeywords();
				
				}


	}

}
