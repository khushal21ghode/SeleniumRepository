package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
    public static void main(String[] args) throws InterruptedException {
	WebDriver	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	
	driver.switchTo().activeElement().sendKeys("rachel", "green",Keys.ENTER);
	driver.findElement(By.className("gLFyf")).click();
	}
}
