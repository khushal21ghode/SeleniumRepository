package pomPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import KeyWordDrivenFramework.Flib;

public class BaseTest extends Flib implements IautoConstant{
	
	
	static WebDriver driver;
    public void openBrowser() throws IOException
   {
	
	//read the data from property file to get BrowserValue and url 
	        Flib flib = new Flib(); 
	        String browservalue = flib.readPropertyData(PROP_PATH, "Browser");
	       String url = flib.readPropertyData(PROP_PATH, "Url");
	       
	       if(browservalue.equalsIgnoreCase("chrome"))
	       {
	    	               driver=new ChromeDriver();
	       }
	       
	       else if(browservalue.equalsIgnoreCase("firefox"))
	       {
	    	            driver=new FirefoxDriver();
	       }
	       else if(browservalue.equalsIgnoreCase("edge"))
	       {
	    	              driver= new EdgeDriver();
	       }
	       else
	       {
	    	   System.out.println("enter the Valid Browser Value!!! ");
	       }
	      
	   // maximize the  Browser 
	   driver.manage().window().maximize();
	   //Apply implicit wait 
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   //Launch the Webapplication 
	   driver.get(url);
}  
	       
	   //to close the browser 
	  public void closeBrowser()
	  {
		  driver.quit();
	  }
	 	       

}
