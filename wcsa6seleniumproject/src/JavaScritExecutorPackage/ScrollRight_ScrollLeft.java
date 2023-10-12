package JavaScritExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight_ScrollLeft {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	  driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
	//to perform scrolling operations do the explicit typecasting into JavaScriptExecutor(I)
	 JavascriptExecutor    jse=(JavascriptExecutor)driver;
	 
	 //perfrom Scroll right for 2 times 
	 for(int i=0;i<=1;i++)
	 {    
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(5000,0)");
	 }
	  
	 Thread.sleep(4000);
	 
	 //perfrom Scroll Left for 2 times 
	 for(int i=0;i<=1;i++)
	 {
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(-5000,0)");
	 }
	 
	 


	}
}
