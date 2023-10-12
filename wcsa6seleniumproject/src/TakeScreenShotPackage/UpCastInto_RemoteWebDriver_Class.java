package TakeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class UpCastInto_RemoteWebDriver_Class {

	//takes screnshots upcast into Remotewedriver Class
	public static void main(String[] args) throws IOException {
    	RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("http://laptop-mcihk329/login.do");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        
             File  src=driver.getScreenshotAs(OutputType.FILE);
             File  dest=new File("./Screenshots/actitime.jpg");
             Files.copy(src, dest);
        

	}

}
