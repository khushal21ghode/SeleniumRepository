package ReadExcelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
        
		//to write the data in Excel Sheet ...(to write only cell/column);
		
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(1);
		Cell cell = row.createCell(2);

		//pass the  value for Cell 
		cell.setCellValue("Pune");

		FileOutputStream fos = new FileOutputStream("./Data/TestData.xlsx");
		wb.write(fos);



	}

}
