package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {
   // Xpath By using concat function
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("khushal@123");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("123456");
	Thread.sleep(2000);
	
	}
	  
}
