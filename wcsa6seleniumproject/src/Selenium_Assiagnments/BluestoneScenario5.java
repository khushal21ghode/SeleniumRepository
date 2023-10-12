package Selenium_Assiagnments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneScenario5 {
          public static void main(String[] args) throws InterruptedException {
			 WebDriver     driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			 
			 driver.get("https://www.bluestone.com/");
			 
			 //handle the popup 
			 driver.findElement(By.id("denyBtn")).click();
			 
			 //to perfrom mouse hover actions Rings menu
			      Actions act= new Actions(driver);
			      Thread.sleep(2000);
			 //identify the web element 
	  		  WebElement target = driver.findElement(By.xpath("//a[text()='Rings ']"));
	  		  act.moveToElement(target).perform();
	  		  
	  		  driver.findElement(By.xpath("(//a[text()='Diamond'])[1]")).click();
	  		  
//	  		  driver.findElement(By.id("Price-form")).click();
//	  		  
//	  		  WebElement Ringsprice = driver.findElement(By.name("price"));
//	  		  System.out.println(Ringsprice.getText());
	  		  
	  		  WebElement price = driver.findElement(By.xpath("//span[text()=' 21,503 ']"));
	  		  System.out.println(price.getText());
	  		  
	  		    		 
	  		  
		}
}
