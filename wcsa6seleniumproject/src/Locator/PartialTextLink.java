package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialTextLink {
    public static void main(String[] args) throws InterruptedException {
	WebDriver	 driver =new ChromeDriver();
	driver.manage().window().maximize();
	 
	//to open child browser to omoyo blogspot
	Thread.sleep(2000);
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.partialLinkText("up window")).click();
	}
}
