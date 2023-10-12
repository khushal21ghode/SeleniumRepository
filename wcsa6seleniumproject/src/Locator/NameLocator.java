package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
   //with the help name locator we can identify userName and password text field 
	 public static void main(String[] args) throws InterruptedException {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		//with the help name locator identify userName text field
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("khushal@123");
		
		//with the help name locator identify password text field 
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("pass1234");
	

		
	}
}
