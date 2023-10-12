package MethodOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class switchToMethod {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//use switchTo method switch the control to active element on google search Box
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		
		        
		
	}
}
