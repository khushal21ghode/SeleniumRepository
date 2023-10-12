package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {



	//it is use to store Generic Reusable Method 
	// All the Generic Reusable Methods are non static 

	//Read the Data From Excel sheet 
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); // Provide the Path of file which we want work with
		Workbook wb = WorkbookFactory.create(fis);     // make the file  ready to read 
		Sheet sheet = wb.getSheet(sheetName);          //provide sheetName
		Row row = sheet.getRow(rowCount);             // get into desired row 
		Cell cell = row.getCell(cellCount);           // get into the desired cell 
		String data = cell.getStringCellValue();      //use to read the value/Data from cell

		return data;
	}



	//Write the Data into Excel Sheet  ...to Create Cell 
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet     sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}



	//Write the Data into Excel sheet .....to create Row 
	public void writeExcelData1(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.createRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);

	}

                         
	// Get the Last Row Count From excel sheet 
	public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int row = sheet.getLastRowNum();      // it is Used to get last Count Row where we Store The Data 
		return row;
	}






}
