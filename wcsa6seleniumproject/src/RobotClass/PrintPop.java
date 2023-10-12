package RobotClass;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPop {
        public static void main(String[] args) throws AWTException, InterruptedException {
	    WebDriver  driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    
	    driver.get("https://www.selenium.dev/");
	    
	    //create an object for robot class
	           Robot     robot=new Robot();
	           
	           Thread.sleep(2000);
	           //to press key
	           robot.keyPress(KeyEvent.VK_CONTROL);
	           robot.keyPress(KeyEvent.VK_P);
	           
	           //to realese key 
	           robot.keyRelease(KeyEvent.VK_CONTROL);
	           robot.keyRelease(KeyEvent.VK_P);
	           
	           Thread.sleep(2000);
	           //to press tab key
	           robot.keyPress(KeyEvent.VK_TAB);
	           robot.keyRelease(KeyEvent.VK_TAB);
	           
	           // to enter key
	           robot.keyPress(KeyEvent.VK_ENTER);
	           robot.keyRelease(KeyEvent.VK_ENTER);
	           
	           
		}
}
