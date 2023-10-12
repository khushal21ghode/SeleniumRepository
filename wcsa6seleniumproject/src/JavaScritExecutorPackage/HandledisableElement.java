package JavaScritExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledisableElement {

	public static  void main(String[] args) throws InterruptedException {
	WebDriver  driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1:5500/DisabledWebElement.html");
	Thread.sleep(2000);
	
     //Explicit Type Casting JavaScriptExecutor  interface 
	// handle disable webelement 
	       JavascriptExecutor jse = (JavascriptExecutor)driver;
	       jse.executeScript("document.getElementById('i2').value='Manager'");

	}

}
