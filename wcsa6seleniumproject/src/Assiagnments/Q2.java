package Assiagnments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static  void main(String[] args) throws InterruptedException {
		
		//How to close All Browser without using Quit 
		WebDriver	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://omayo.blogspot.com/");

		Thread.sleep(3000);

		WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView[true]",childBrowser);
           
		//click on Link 
		childBrowser.click();
		
        //get the Address of all windows 
		Set<String> AllHandles = driver.getWindowHandles();
		
	
		Thread.sleep(3000);
		for(String wh:AllHandles)
		{
			//close the Browser By Switch the address of window 
			driver.switchTo().window(wh).close();

		}


	}

}
