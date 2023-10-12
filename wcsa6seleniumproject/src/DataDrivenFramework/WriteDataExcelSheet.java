package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class WriteDataExcelSheet extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	          
		  //write the data in Excel Sheet 
		     Flib flib= new Flib();
		     flib.writeExcelData("./Data/ActitimeTestData.xlsx","Validcreds",2 , 2, "pune");
		             

	}

}
