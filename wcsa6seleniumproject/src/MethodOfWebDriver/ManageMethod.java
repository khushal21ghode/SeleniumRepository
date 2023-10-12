package MethodOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
   public static void main(String[] args) throws InterruptedException {
	WebDriver  driver  =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//set size of browser by using manage method 
	Dimension targetSize=new Dimension(450,250);
	driver.manage().window().setSize(targetSize);
	Thread.sleep(2000);
	//set position of browser by using manage method 
	Point targetposition =new Point(450, 350);
	driver.manage().window().setPosition(targetposition);
	driver.close();
	
	
	
}
}
