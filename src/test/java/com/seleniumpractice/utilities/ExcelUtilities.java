package com.seleniumpractice.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.seleniumpractice.constants.Constants;

public class ExcelUtilities {

	static FileInputStream stream;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	//static XSSFCell cell;
	public static String actionCellValue;
	public static String valueCellValue;
	public static String locatorsCellValue;
	public static int rowCount;
	public static String loctorID;
	public static String locatorValue;

	public static void excelReader() throws IOException {

		stream = new FileInputStream(Constants.FILE_PATH);
		workbook = new XSSFWorkbook(stream);
		sheet = workbook.getSheet(Constants.SHEET_NAME);
		rowCount = sheet.getLastRowNum();
	}


	public static void readExcelValue(int rowNo, int actionKeywordColumnNo, int valueColumnNo, int locatorsColumnNo) throws Exception {
		// TODO Auto-generated method stub
		
		locatorsCellValue = sheet.getRow(rowNo).getCell(locatorsColumnNo).toString().trim();
		if(!locatorsCellValue.contains("NA")) {
		//System.out.println(loctorID = locatorsCellValue.split("=")[0].toString().trim()); 
		loctorID = locatorsCellValue.split("=")[0].toString().trim();
		//System.out.println(locatorName = locatorsCellValue.split("=")[1].toString().trim());
		locatorValue = locatorsCellValue.split("=")[1].toString().trim();
		}else {
			//System.out.println(loctorID = "NA"); 
			loctorID = "NA";
			//System.out.println(locatorName = "NA"); 
			locatorValue = "NA";
		}
		
		//System.out.println(actionCellValue = sheet.getRow(row).getCell(actionKeywordColumn).toString().trim());
		valueCellValue = sheet.getRow(rowNo).getCell(valueColumnNo).toString().trim();
		actionCellValue = sheet.getRow(rowNo).getCell(actionKeywordColumnNo).toString().trim();
		//Engine.executeKeywords();
		//System.out.println(valueCellValue = sheet.getRow(row).getCell(valueColumn).toString().trim());
		
		//return actionCellValue;

	}

}
