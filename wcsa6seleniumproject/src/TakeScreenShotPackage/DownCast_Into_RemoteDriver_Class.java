package TakeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class DownCast_Into_RemoteDriver_Class {

	public static void main(String[] args) throws IOException {
		
		//Takes screenshots by using DownCast_Into_RemoteDriver_Class
	       WebDriver driver=new ChromeDriver();
	       RemoteWebDriver rwd=(RemoteWebDriver)driver;
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("https://www.netflix.com/in/");
	       
	      File src=rwd.getScreenshotAs(OutputType.FILE);
	      File dest =new File("./Screenshots/Netflix.jpg");
	      
	      Files.copy(src, dest);

	}

}
