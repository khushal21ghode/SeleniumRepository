package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDislplayedMethod {

	public static void main(String[] args) {
	   WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	   driver.get("http://laptop-mcihk329/login.do");
	    WebElement  Checkbox =driver.findElement(By.name("remember"));
	     boolean   result =Checkbox.isDisplayed();
	     System.out.println(result);

	}

}
