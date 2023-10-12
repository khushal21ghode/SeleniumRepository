package testNGExcecution;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class Searchjava {
  @Test
  public void java_search_in_Chrome() throws InterruptedException {
	  
	        WebDriver  driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        driver.get("https://www.google.com");
	        
	        driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	        
	        Reporter.log("java",true);
	        
	        Thread.sleep(2000);
	        
	        driver.quit();
	        
  }
}