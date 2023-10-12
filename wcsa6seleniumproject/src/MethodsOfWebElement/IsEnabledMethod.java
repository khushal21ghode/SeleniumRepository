package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		WebDriver   driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.instagram.com/");
	    
	    driver.findElement(By.name("username")).sendKeys("khushalghode");
	    driver.findElement(By.name("password")).sendKeys("Khushal@123");
	    
	    //identify the Login webelement is enabled or not 
	     WebElement   LoginButton =driver.findElement(By.xpath("//button[.='Log in']"));
	       boolean    result = LoginButton.isEnabled();
	       System.out.println(result);
	}

}
