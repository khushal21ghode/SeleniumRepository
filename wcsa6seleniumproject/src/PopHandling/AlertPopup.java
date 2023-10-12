package PopHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
	WebDriver  driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("file:///E:/HTMLCODE/Alert.html");
    
    //generate the Alert Popup
     WebElement button = driver.findElement(By.xpath("//button[text()='Click me!']"));
     button.click();
     
     //handles the Popup Switching the Controls To Alert
     Alert al = driver.switchTo().alert();
    // al.accept();
    // al.dismiss();
     
     System.out.println(al.getText());
     Thread.sleep(2000);
     al.accept();
     
    Thread.sleep(2000);
    
    driver.close();
	}

}
