package FramePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.bluestone.com/");

		//handle the popup
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);

		//this chat box is design under the frame 
		// handle frame first by identify it....
		
		//driver.switchTo().frame(3);   ..........handle frame by using index value  
		// driver.switchTo().frame("fc_widget");  ...........we handle frame by using name or id Attribute 


		WebElement Element = driver.findElement(By.id("fc_widget"));
		//  driver.switchTo().frame(Element);   .......handle  the frame by using by using frame webElement    

		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();

		//switch controls to main page 
		// driver.switchTo().defaultContent();

		//switch control to parent page 
		driver.switchTo().parentFrame();

		driver.findElement(By.id("chat-fc-name")).sendKeys("khushal");
		driver.findElement(By.id("chat-fc-email")).sendKeys("khushal@123");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("123456789");



	}

}
