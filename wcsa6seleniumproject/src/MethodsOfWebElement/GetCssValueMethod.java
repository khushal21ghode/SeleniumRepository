package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
   public static void main(String[] args) {
	 WebDriver  driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 //to apply implicit wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 driver.get("https://www.netflix.com/in/login");
	  String    signin =driver.findElement(By.xpath("//button[text()='Sign In']")).getCssValue("background-color");
	 System.out.println(signin);
}
}
