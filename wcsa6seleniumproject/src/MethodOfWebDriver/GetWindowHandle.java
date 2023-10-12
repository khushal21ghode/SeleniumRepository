package MethodOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       driver.get("http://omayo.blogspot.com/");
       
       //Get the address of Parent window 
        String ParentHandle = driver.getWindowHandle();
        System.out.println(ParentHandle);

	}

}
