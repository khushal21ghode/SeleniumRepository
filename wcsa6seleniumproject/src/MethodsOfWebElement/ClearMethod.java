package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
      public static void main(String[] args) {
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	    //to apply imlicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		//to launch actitime
		driver.get("http://laptop-mcihk329/login.do");
		
		//to identify the Username Textbox and pass the invalid input
		WebElement    UsernametextBox= driver.findElement(By.name("username"));
		UsernametextBox.sendKeys("admin123");
		
		//to identify the password text box and pass the valid input 
		 WebElement     Passwordtextbox   = driver.findElement(By.name("pwd"));
		 Passwordtextbox.sendKeys("manager");
		 
		 //to identify the login button
	       WebElement	 LoginButton=driver.findElement(By.id("loginButton"));
	       LoginButton.click();
	       
	     //to clear the invalid username inputs in username textbox 
	       driver.findElement(By.name("username")).clear();
		 
	}
}
