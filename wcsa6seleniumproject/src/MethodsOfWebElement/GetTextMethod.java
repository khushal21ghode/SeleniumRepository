package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
      public static void main(String[] args) {
		WebDriver      driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("khushal@123");
		driver.findElement(By.name("password")).sendKeys("khushal@99");
		 String   LoginButton =driver.findElement(By.xpath("//button[.='Log in']")).getText();
		 System.out.println(LoginButton );
		
	}
}
