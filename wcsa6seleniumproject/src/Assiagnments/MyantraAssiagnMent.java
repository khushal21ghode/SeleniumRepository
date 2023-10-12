package Assiagnments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyantraAssiagnMent {

	public static void main(String[] args) throws InterruptedException {
		
	 ChromeOptions co=new ChromeOptions();
      co.addArguments("--disable-notifications");
      
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	//Launch the web Application
	driver.get("https://www.myntra.com/");
	
	//get the address of Parent window 
	        String parentHandle = driver.getWindowHandle();
	
	// search for shoes in search Box
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoes");
	
	//click on search icon
	driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	
	//click on first shoes 
	driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		
//	get the address of parent and child window 
	
	 Set<String> allHandles = driver.getWindowHandles();
	 
	 for(String wh:allHandles)
	 {
		 if(!parentHandle.equals(allHandles))
		 {
			 driver.switchTo().window(wh);
		 }
	 }
	 
	 //click on Size
	 driver.findElement(By.xpath("//button[contains(@class,'size-buttons-')]/ancestor::div[@class='size-buttons-buttonContainer']/descendant::p[text()='8']")).click();
	
	 //send the Pincode
	 driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("411033");
	 
	 //click on check 
	 driver.findElement(By.xpath("//input[@class='pincode-check pincode-button']")).click();
	 
	 //click on add to Bag
	 driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	 
	 //click on add to Bag Symbol 
	 driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
	 
	
	 //handle the Pop Up
	 driver.findElement(By.xpath("//div[@class='itemContainer-base-itemLeft']")).click();
	 
	 //click on remove Text WebElement 
	 driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
	 
	 //click on Confiramation Message Remove 
	 driver.findElement(By.xpath("(//button[text()='REMOVE'])[2]")).click();
	 
	
	

	}

}
