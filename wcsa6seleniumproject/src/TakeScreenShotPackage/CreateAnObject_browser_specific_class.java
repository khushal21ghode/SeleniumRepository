package TakeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CreateAnObject_browser_specific_class {

	public static void main(String[] args) throws IOException {
		      ChromeDriver  driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		      
		      driver.get("https://www.instagram.com/accounts/login/");
		      driver.findElement(By.name("username")).sendKeys("khushal@123");
		      driver.findElement(By.name("password")).sendKeys("khushal@99");
		      driver.findElement(By.xpath("//div[text()='Log in']")).click();
		      
		     File  src=driver.getScreenshotAs(OutputType.FILE);
		     File   dest =new File("./Screenshots/instagram.jpg");
		     Files.copy(src, dest);
		      
		      
		        

	}

}
