package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
public static void main(String[] args) throws InterruptedException {
	//to launch chrome browser
	
	 WebDriver driver =new ChromeDriver();

	  //maxize the browser
      driver.manage().window().maximize();
      
      //stop the executoin od scroitp 2 sec
      Thread.sleep(2000);
      
      driver.close();
      
      
	
}
}
