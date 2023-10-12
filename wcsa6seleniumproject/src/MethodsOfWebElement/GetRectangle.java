package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangle {

	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		//to apply impicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		     Rectangle LoginButton2= driver.findElement(By.xpath("//button[text()=' Login ']")).getRect();
		     
	      int  xaxis =LoginButton2.getX();
	      int  yaxis =LoginButton2.getY();
	      
	      int  height   =LoginButton2.getHeight();
	      int  width    =LoginButton2.getWidth();
	      
	      System.out.println(xaxis+ " "+yaxis+ " "+height+ " "+width);        

	}

}
