package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
		        BaseTest bt = new BaseTest();
		        bt.openBrowser();
		        
		        //refer the WebElemnts from Loginpage By using pom class 
		         
		          LoginPage lp = new  LoginPage(driver);
		          
		          //read the invalidUsername & invalidPassword 
		            Flib flib = new Flib();
		            int rc = flib.getLastRowCount(EXCEL_PATH, INVALID_SHEETNAME);
		            
		            for(int i=1;i<=rc;i++)
		            {
		            	lp.invalidLogin(flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i,0),flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 1));
		            }
		            Thread.sleep(2000);
		            bt.closeBrowser();
		       
		
		
		
		

	}

}
