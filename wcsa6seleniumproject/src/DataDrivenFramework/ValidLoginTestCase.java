package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase extends Flib{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		WebDriver     driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-mcihk329/login.do");

		//read the Valid userName & valid Password from ActitimeTestData Excel File 

		Flib flib = new Flib();
		String username = flib.readExcelData("./Data/ActitimeTestData.xlsx","Validcreds", 1, 0);
		String password = flib.readExcelData("./Data/ActitimeTestData.xlsx","Validcreds", 1, 1);



		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys(username);
		Thread.sleep(2000);
		WebElement Pass = driver.findElement(By.name("pwd"));
		Pass.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		driver.quit();

	}

}
