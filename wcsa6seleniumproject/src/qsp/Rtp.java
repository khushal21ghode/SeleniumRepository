package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rtp {
	public static void main(String[] args) throws InterruptedException {
		
		//take the input from user 
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter the browser");
		
		String browserValue = sc.next();
	    if(browserValue.equalsIgnoreCase("chrome")) 	
	    {
	    	 WebDriver driver=new ChromeDriver();
	    	  driver.manage().window().maximize();
	    	  Thread.sleep(2000);
	    	  driver.close();
	    	
	    }
	    else if(browserValue.equalsIgnoreCase("Firefox"))
	    {
	    	WebDriver driver=new FirefoxDriver();
	    	  driver.manage().window().maximize();
	    	  Thread.sleep(2000);
	    	  driver.close();
	    
	    }
	    else if(browserValue.equalsIgnoreCase("Edge"))
	    {  
	    	WebDriver driver=new EdgeDriver();
	    	  driver.manage().window().maximize();
	    	  Thread.sleep(2000);
	    	  driver.close();
	    	
	    	
	    }
	    else
	    {
	    	System.out.println("browsre value is incorrect");
	    }
	    	
	
	}

}
