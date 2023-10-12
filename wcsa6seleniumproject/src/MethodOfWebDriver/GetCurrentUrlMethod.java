package MethodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
   public static void main(String[] args) throws InterruptedException {
	
	   //it is use to get the url of Current Webpage
	   

	     WebDriver  driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     //launch the Instagram 
	     
	     driver.get("https://www.instagram.com/");
	       //get current url  Current webPage
	      String urlofloginpage=driver.getCurrentUrl();
	      System.out.println(urlofloginpage);
	      Thread.sleep(2000);
	      driver.close();
	     
	    
}
}
