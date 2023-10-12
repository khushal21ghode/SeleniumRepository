package Assiagnments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {

		//How to Close Only child Browser 
		WebDriver	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://omayo.blogspot.com");
		//get the address of Parent Browser 
		String Parentaddress = driver.getWindowHandle();

		Thread.sleep(2000);

		//Scroll Till open popup Window Link
		WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView[true]",childBrowser);

		//click on Link 
		childBrowser.click();

		//get the address of parent browser and child Browser 
		Set<String> alladdress = driver.getWindowHandles();

		for(String wh:alladdress)
		{
			if(!Parentaddress.equals(alladdress))
			{
				driver.switchTo().window(wh).close();
			}

		}

	}

}
