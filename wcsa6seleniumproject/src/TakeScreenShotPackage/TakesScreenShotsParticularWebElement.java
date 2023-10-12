package TakeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenShotsParticularWebElement {

	public static void main(String[] args) throws IOException {
		    WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    	driver.get("https://www.selenium.dev/");
	    	
	     WebElement newselement=driver.findElement(By.xpath("//h2[.='News']"));
	     File   src=newselement.getScreenshotAs(OutputType.FILE);
	      File   dest= new File("./Screenshots/news.png");
	      
	      Files.copy(src, dest);

	}

}
