package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assertion {

	//	System.out.println("Launch the chrome Browser!! and maximize it");
	//	System.out.println("Launch the orangehrm WebApplication!! and verfify with title !!");
	//	System.out.println("If title is verfied perfom Login!!");
	//	System.out.println("verfify the home page is display or not!!");
	//	System.out.println("if it display click on logout!!");

	static WebDriver driver;
	@Test
	public void LoginMethod() 
	{
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		SoftAssert sa = new SoftAssert();  //Soft assert
		sa.assertEquals(driver.getTitle(), "title");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		String titleofhp = "OrangeHRM";
		Assert.assertEquals(driver.getTitle(), titleofhp);  //HardAssert

		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		WebElement logout = driver.findElement(By.partialLinkText("Logout"));
		Assert.assertEquals(logout.isDisplayed(), true);

		logout.click();


		



	}
}
