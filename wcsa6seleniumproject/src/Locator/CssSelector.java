package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
        public static void main(String[] args) throws InterruptedException {
		WebDriver	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name^='u']")).sendKeys("khushal@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name^='p']")).sendKeys("k123456");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type$='t']")).click();
		
		
		
		}
}
