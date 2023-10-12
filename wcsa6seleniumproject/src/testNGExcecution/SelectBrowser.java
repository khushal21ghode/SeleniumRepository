package testNGExcecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	
  static WebDriver driver;
  
  @Parameters({"Browser","Url","username","password"})
  @Test
  public void select_Browser_method(String browservalue,String url,String usn,String pass) throws InterruptedException 
  {
	   if(browservalue.equalsIgnoreCase("chrome")) 
	   {
		            driver=new ChromeDriver();
	   }
	   else if(browservalue.equalsIgnoreCase("firefox"))
	   {
		           driver=new FirefoxDriver();
	   }
	   
	   else
	   {
		   Reporter.log("enter the valid Browser Value", true);
	   }
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get(url);
	   
	    // Thread.sleep(2000);
	   //identify the username TextBox 
	   driver.findElement(By.name("username")).sendKeys(usn);
	   
	 //  Thread.sleep(2000);
	   //identify the username TextBox 
	   driver.findElement(By.name("pwd")).sendKeys(pass);
	   
	  // Thread.sleep(2000);
	   driver.findElement(By.id("loginButton")).click();
	   
	   Thread.sleep(2000);
	   driver.quit();
  }
}
