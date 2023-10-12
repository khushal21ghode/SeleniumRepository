package MethodOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("http://omayo.blogspot.com/");
	       
	       //Get the address of Parent window 
	        String ParentHandle = driver.getWindowHandle();
	        System.out.println(ParentHandle);
	        
	        Thread.sleep(2000);
	        //scroll till open a Pop up window 
	        WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true)",childBrowser);
			
			childBrowser.click();
			
			//address of Parent as well as Child Browser or window 
			  Set<String> allHandles = driver.getWindowHandles();
			  
			  
			System.out.println("Address of parent window :"+ParentHandle);
			System.out.println("Address of Parent And Child window:"+allHandles);
			
			
			//get the Address of child window 
			
             for(String wh:allHandles)
             {
            	 if(!ParentHandle.equals(wh))
            	 {
            		 System.out.println("Addres of child window:"+wh);
            	 }
             }
	        


	}

}
