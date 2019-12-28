package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadWrite {
/*
 create custom class that can read and write an excel file
    instance variables: String filePath
                        String sheetName
                        String FileInputStream file;
                        Workbook excelFile;
                        Sheet sheet;
                        
                         	Cell
    Actions: ReadData(int row, int cell) ==>String
             WriteData(int row, int cell, setValue) ==>voi                       	
 */
	String filePath;
    String sheetName;
    FileInputStream file;
    Workbook excelFile;
    Sheet sheet;
    Cell cell;
    
    public ExcelReadWrite(String filePath,   String sheetName) {
    	this.filePath = filePath;
    	this.sheetName = sheetName;
    	
    	try {
    	file = new FileInputStream(filePath);
    	excelFile = WorkbookFactory.create(file);
    	sheet = excelFile.getSheet(sheetName);
    	}catch(Exception e) {
    		
    	}
    }
    
    public String readData(int rowNum, int cellNum) {
    	String data = "";//store the cell data
    	cell = sheet.getRow(rowNum).getCell(cellNum);
    	data=cell.toString();
    	return data;
    }
    
    public void writeData(int rowNum, int cellNum, String setValue) {
    	cell = sheet.getRow(rowNum).getCell(cellNum);
    	cell.setCellValue(setValue);
    }
    
   
}
