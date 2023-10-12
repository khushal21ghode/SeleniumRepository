package JavaScritExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alert_PopPup {

	public static void main(String[] args) throws InterruptedException {
	
		
		//how to handle alert popup 
	  WebDriver   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  //Alert Window with Ok Button
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  
	  Thread.sleep(2000);
	  
	  //Alert Window With ok And Cancel button 
	  driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();  //.......close alert By using Ok Button 
	  
	 // driver.switchTo().alert().dismiss();  ........close the window By using cancel button 
	  
	  //How Pass the input in text Box

	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  
	  Alert alertwindow = driver.switchTo().alert();
	  alertwindow.sendKeys("WelCome");
	  Thread.sleep(5000);
	  alertwindow.accept();
	  
	  
		

	}	

}
