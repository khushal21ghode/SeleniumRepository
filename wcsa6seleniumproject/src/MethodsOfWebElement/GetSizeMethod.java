package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
	 WebDriver  driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	        Dimension   UsernameTextBox =driver.findElement(By.name("username")).getSize();
	      int height = UsernameTextBox.getHeight();
	      int  width = UsernameTextBox.getWidth();
	      
	      System.out.println("Height of usernametextbox button:"+height+ "width of usernametextBox:"+width+" " );
	          
	 

	}

}
