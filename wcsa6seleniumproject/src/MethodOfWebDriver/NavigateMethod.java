package MethodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateMethod {
     public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//launch the web application using navigate method 
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(2000);
	//use navigate method perfrom backword operation 
	driver.navigate().back();
	Thread.sleep(2000);
	//use navigate method perfrom forward operation 
	driver.navigate().forward();
	
	//use navigate method perfrom refresh operation 
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.close();
	
	
	
	}
}
