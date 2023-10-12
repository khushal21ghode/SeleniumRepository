package KeyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();

		//Read the Invalid username And Password from ActitimeTestData excel file 

		Flib flib = new Flib();
		int rc = flib.getLastRowCount(EXCEL_PATH, INVALID_SHEETNAME);

        Thread.sleep(2000);
		for(int i=1;i<=rc;i++)
		{     

         	String usn = flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 0);
         	
			//identify the Username Text Box and pass the Invalid username 
			driver.findElement(By.name("username")).sendKeys(usn);
			
			      String pass = flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i,1);
			      
			//Identify the Invalid Password and Pass Invalid Password 
			driver.findElement(By.name("pwd")).sendKeys(pass);
			
			//identify the login Button and click 
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			
		}
		Thread.sleep(2000);
		bt.closeBrowser();


		}

	}
