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

public class AssignmentOnRobotandActions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.selenium.dev/");
		//identify the getting stared WebElement 
		WebElement	 Gettingstarted=driver.findElement(By.xpath("//h2[text()='Getting Started']"));

		//perfrom mouse hover actions on getting started 
		Actions act = new Actions(driver);
		act.moveToElement(Gettingstarted).perform();
		//perfrom Right click
		act.contextClick(Gettingstarted).perform();

		//Pass the controls to inspect Option 

		// create an object for robot class 
		Robot    robot=new Robot();
		for(int i=0;i<=9;i++)
		{   
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}

		Thread.sleep(2000);
		//press the enter Key
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


	}

}
