package KeyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		//create an object for BaseTest class 
		BaseTest bt = new BaseTest();
		bt.openBrowser();

		// Read the valid Username & Password from property file 
		Flib flib = new Flib();
		String usn = flib.readPropertyData(PROP_PATH,"Username");
		//identify the username TestBox
		driver.findElement(By.name("username")).sendKeys(usn);
		String pass = flib.readPropertyData(PROP_PATH, "Password");
		//identify the Password Text box 
		driver.findElement(By.name("pwd")).sendKeys(pass);

		//identify the Login Button 
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		bt.closeBrowser();




	}

}
