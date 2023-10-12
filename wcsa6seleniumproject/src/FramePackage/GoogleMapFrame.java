package FramePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapFrame {

	public static void main(String[] args) {
	  WebDriver	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://www.google.com/");
	  
	  //click on google  maps 
	  driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	  
	  //handle the frame  by frame index value 
	  driver.switchTo().frame(1);
	  //click on maps 
	  driver.findElement(By.xpath("//span[text()='Maps']")).click();
	  

	}

}
