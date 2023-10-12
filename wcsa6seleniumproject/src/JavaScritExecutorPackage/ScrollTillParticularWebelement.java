package JavaScritExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebelement {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    	driver.get("https://www.selenium.dev/");
    	
    	//Scroll til particular web element 
    	//webelement is NEWS text
    	
    	//identify news webElement
   WebElement 	newselement=driver.findElement(By.xpath("//h2[.='News']"));
            Point   loc=newselement.getLocation();
            
            //Passing the input from Js code 
            //perfrom Scrolling  till news Element 
            Thread.sleep(2000);
            JavascriptExecutor jse=(JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy("+loc.getX()+","+(loc.getY()+90)+")");
          //  jse.executeAsyncScript("arguments[0].scrollIntoView(true)",newselement );
    	

	}

}
