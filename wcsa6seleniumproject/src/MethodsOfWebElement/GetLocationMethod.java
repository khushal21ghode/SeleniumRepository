package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
	   WebDriver        driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Point  LoginButton =driver.findElement(By.xpath("//button[text()=' Login ']")).getLocation();
	  
	    int xaxis =LoginButton.getX();
          int yaxis =LoginButton.getY();
	       
	    System.out.println("This is the Xaxis of Login Button :"+xaxis+" "+"This is the Y-axis of login Button:"+yaxis);

	}

}
