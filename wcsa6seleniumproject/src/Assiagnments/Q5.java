package Assiagnments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) {
		
	  //How To Maximize Child browser 
		
		WebDriver	 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com");
	
	// get address of parent window 
		String ParentWindow = driver.getWindowHandle();
	
	//Scroll Till Popup Window link
		WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView[true]",childBrowser);
	
		//click on link
		childBrowser.click();
		
		//get the address of parent browser and child Browser 
		Set<String> AllWindowHandle= driver.getWindowHandles();
		
		for(String wh:AllWindowHandle)
		{
			if(!ParentWindow.equals(wh))
			{
				driver.switchTo().window(wh).manage().window().maximize();
			}
		}
		
		

	}

}
