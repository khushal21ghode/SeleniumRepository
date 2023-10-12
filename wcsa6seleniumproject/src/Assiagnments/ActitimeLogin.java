package Assiagnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
       public static void main(String[] args) throws InterruptedException {
	WebDriver	   driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://laptop-mcihk329/login.do");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.name("//a[text()='Login']")).click();
	
	}
}
