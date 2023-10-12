package MethodOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitMethod {
	//it is use to close parent and child browser
   public static void main(String[] args)throws  InterruptedException { 
	 
	   //parent browser
	   WebDriver driver=new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	   //lanuch the Webapplication 
	   
	   driver.get("http://omayo.blogspot.com/");
	   
	   
	   //launch the child browser
	   driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	   //use the close method 
	   //driver.close();
	   Thread.sleep(2000);
	   driver .quit();
	   
	   
	      
	   
	   
}
}
