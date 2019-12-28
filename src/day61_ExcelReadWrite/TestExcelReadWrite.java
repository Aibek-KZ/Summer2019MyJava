package day61_ExcelReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcelReadWrite {

	 public static void main(String[] args) throws Exception{
		 
		  String path = "C:\\Users\\Aibek\\IdeaProjects\\Summer2019OnlineTestNGSeleniumProject2\\vytrack_testusers.xlsx";
	    	String sheetName = "QA1-short";
	    	
	    	FileInputStream excelFile = new FileInputStream(path);
	    	Workbook file = WorkbookFactory.create(excelFile);
	    	Sheet sheet = file.getSheet(sheetName);
	    	Cell cell = sheet.getRow(0).getCell(0);  
	    	cell.setCellValue(0);
	    	String ExcelData = cell.getStringCellValue();
	    	System.out.println(ExcelData);
		}
}
