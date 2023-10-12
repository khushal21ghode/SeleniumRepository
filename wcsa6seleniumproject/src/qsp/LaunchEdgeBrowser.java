package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
 public static void main(String[] args) throws InterruptedException {
	
	//close the edge browser 
	WebDriver driver =new EdgeDriver();
	
	
   
    //maxize the browser
    driver.manage().window().maximize();
    Thread.sleep(5000);
    driver.close();
	
	
}
}
