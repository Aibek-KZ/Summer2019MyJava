package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
    public static void main(String[] args) throws Exception {
        
        String filePath ="C:\\Users\\Aibek\\IdeaProjects\\Summer2019OnlineTestNGSeleniumProject2\\vytrack_testusers.xlsx";  // path of excel file
        
        String sheetname = "QA1-short";  // Name of the sheet
        
        FileInputStream file = new FileInputStream(filePath); // reads a file
        
        Workbook excelFile = WorkbookFactory.create(file); // specially designed for Excel Files
        //XSSFWorkbook excelfile2 = new XSSFWorkbook(file);   // does the same thing
        
        
        Sheet sheet =  excelFile.getSheet(sheetname);  // gets the specific spread sheet from excelfile
        // XSSFSheet sheet2 =excelfile2.getSheet(sheetname);
        
        
        Cell cell = sheet.getRow(2).getCell(0); // retrives specific cell from the speardsheet
        
        
        String cellData = cell.getStringCellValue();  // converts the cell' value to STring data type
        
        System.out.println(cellData);
            
        
    }
}
