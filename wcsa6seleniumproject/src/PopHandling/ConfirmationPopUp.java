package PopHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver   driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///E:/HTMLCODE/confirmation.html");
	    
	    //generate Alert popup 
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    //handle Confirmation popup by using SwitchTo Method 
	    Alert al = driver.switchTo().alert();
	    Thread.sleep(2000);
	    
	   // al.accept();......accepts the confirmation popup 
	    
	  // al.dismiss();.......dismiss the Confirmation Popup 
	    
	   System.out.println(al.getText());
	   al.accept();
	   Thread.sleep(2000);
	    
	    driver.close();
	    

	}

}
