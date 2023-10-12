package JavaScritExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generate_Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
        WebDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://twoplugs.com/");
        driver.findElement(By.xpath("(//span[text()='LOG in'])[1]")).click();
        Thread.sleep(2000);
        
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("alert('Suceessfully clicked on Login Button..');");
         Thread.sleep(5000);
         driver.switchTo().alert().accept();
         
        

	}

}
