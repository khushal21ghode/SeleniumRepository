package Selenium_Assiagnments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScenarioNo4 {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	  
	  //launch the application 
	  driver.get("https://www.ebay.com/");
	  
	 //identify the search box and type some  product name
	  driver.findElement(By.id("gh-ac")).sendKeys("Apple Watches");
	  
	  //identify the catogories dropdown single select 
	  WebElement Dropdown = driver.findElement(By.id("gh-cat"));
	  
	  //Create an object for select class to access the method 
	     Select sel = new Select(Dropdown);
	     
	     Thread.sleep(2000);
	     sel.selectByIndex(5);
	     
	 //click on search button
	  driver.findElement(By.id("gh-btn")).click();
	     
	  
	 
	  

	}

}
