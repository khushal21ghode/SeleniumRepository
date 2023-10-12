package Selenium_Assiagnments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScanarioNo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.bluestone.com/");

		//handle the popup
		driver.findElement(By.id("denyBtn")).click();

		//to perfrom mouse Hover actions on all jewellery
		Actions  act=new Actions(driver);

		WebElement   alljewellery=driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
		act.moveToElement(alljewellery).perform();
		
		//click on kadas Webelement
		driver.findElement(By.xpath("//span[text()='Kadas']")).click();
		
		//get the address of parent window or browser
  		String Parentaddress = driver.getWindowHandle();
  		System.out.println(Parentaddress);

  		//select any kadas
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
		

		//get address of parent and child window or browser
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String wh:allhandles)
		{
			if(!Parentaddress.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		
		Thread.sleep(2000);
		//click on select size Dropdown
		driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
		
		Thread.sleep(2000);
		//select the size from Dropdown
		driver.findElement(By.xpath("//span[text()='2-2(2 2/16\")']")).click();
		
		Thread.sleep(2000);
		//click on buy now 
		driver.findElement(By.id("buy-now")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
