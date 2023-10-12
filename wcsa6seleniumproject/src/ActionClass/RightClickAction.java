package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.bluestone.com/");

		//handle the pop window
		driver.findElement(By.id("denyBtn")).click();

		//identify the Rings option 
		WebElement target = driver.findElement(By.xpath("//a[text()='Rings ']"));

		//perfrom the Right click on rings
		Actions act = new Actions(driver);
		act.contextClick(target).perform();


	}

}
