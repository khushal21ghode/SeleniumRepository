package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver   driver =new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://laptop-mcihk329/login.do");
       
       Thread.sleep(2000);
       driver.findElement(By.name("username")).sendKeys("admin");
       
       Thread.sleep(2000);
       driver.findElement(By.name("pwd")).sendKeys("manager");
       
       Thread.sleep(2000);
       driver.findElement(By.id("loginButton")).click();
	}

}