package MethodsOfWebElement;
            
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class GetAttributeMethod {
     public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.netflix.com/in/login");
		
	    String   EmailtextBox  =driver.findElement(By.name("userLoginId")).getAttribute("class");
	    System.out.println( EmailtextBox);
	}
}
