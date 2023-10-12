
package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) throws InterruptedException {
	WebDriver	  driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 //to open selenium Tutorial Link Text
	 driver.get("http://omayo.blogspot.com/");
	 driver.findElement(By.linkText("SeleniumTutorial")).click();
       
	}
}
