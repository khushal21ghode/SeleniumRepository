package TakeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class EventFiringWebDriverClass {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://chat.qspiders.com/");
		driver.findElement(By.xpath("//input[@placeholder='Enter Registered Number']")).sendKeys("7972735599");
		driver.findElement(By.name("password")).sendKeys("khus5599");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		  EventFiringWebDriver   efw=new EventFiringWebDriver(driver);
		 File  src=efw.getScreenshotAs(OutputType.FILE);
		  File dest=new File("./Screenshots/Qtalk.png");
		  
		  Files.copy(src, dest);

	}

}
