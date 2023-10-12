package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotandActions1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		//use to lauch the application 
		driver.get("https://www.bluestone.com/");
		
        //handle the popup
		driver.findElement(By.id("denyBtn")).click();
		
		//identify the Watch Jewellary WebElement
		WebElement	  watchJewellary=driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
		// to perfrom mouse hover action
		Actions     act=new Actions(driver);
		act.moveToElement(watchJewellary).perform();
		
		//click on Brand WebElement
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		WebElement   filterby=driver.findElement(By.xpath("//span[@class='f-by']"));
		for(int i=0;i<=1;i++)
		{
			act.doubleClick(filterby).perform();
			act.clickAndHold(filterby).perform();
		}
          Thread.sleep(2000);
		//copy the filter by text
		Robot  robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);

		// to realease  the key 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);

		driver.findElement(By.id("search_query_top_elastic_search")).click();

		// filter by text
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		driver.findElement(By.name("submit_search")).submit();



	}

}
