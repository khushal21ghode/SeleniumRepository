package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://laptop-mcihk329/login.do");

		// to read invalid usn & pass from excel sheet 
		Flib flib = new Flib();
		
		//get last row count of row 
		int rc = flib.getLastRowCount("./Data/ActitimeTestData.xlsx","Invalidcreds");
        Thread.sleep(2000);
		for(int i=1;i<=rc;i++)
		{ 
			String username = flib.readExcelData("./Data/ActitimeTestData.xlsx","Invalidcreds",i,0);
			WebElement usn = driver.findElement(By.name("username"));
			usn.sendKeys(username);
			String password = flib.readExcelData("./Data/ActitimeTestData.xlsx", "Invalidcreds",i, 1);
			WebElement pass = driver.findElement(By.name("pwd"));
			pass.sendKeys(password);        
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			
			
		}
		Thread.sleep(2000);
		driver.quit();	

	}

}
