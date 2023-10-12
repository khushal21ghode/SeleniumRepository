package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
    public static void main(String[] args) throws InterruptedException {
    //Xpath by using unique attribute	
    	
	WebDriver	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://laptop-mcihk329/login.do");
	Thread.sleep(2000);
	
	
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Logout")).click();
    
    
    
    
	
	}
}
