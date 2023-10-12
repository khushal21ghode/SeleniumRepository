package MethodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetMethod {
   public static void main(String[] args) throws InterruptedException {
	
	   //launch chrome browser 
	   
	     WebDriver  driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.netflix.com/in/");
	     Thread.sleep(5000);
	     driver.close();
	    
	    
}
}
