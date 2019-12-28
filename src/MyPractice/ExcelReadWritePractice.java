package MyPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadWritePractice {
	
	public String readData() throws Exception{
		String pathExcel = "C:\\Users\\Aibek\\Desktop\\TestData.xlsx";
		String sheetName = "Sheet2";
		
		FileInputStream file = new FileInputStream(pathExcel);
		Workbook excelFile = WorkbookFactory.create(file);
		Sheet sheet = excelFile.getSheet(sheetName);
		Cell cell = sheet.getRow(0).getCell(0);
		
		String cellData = cell.getStringCellValue();
		System.out.println(cellData);
		
		return cellData;
	}
	
	
	public static void main(String[] args)  {
		
		
		
	}

}
