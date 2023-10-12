package Selenium_Assiagnments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scanario1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver     driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("http://jqueryui.com/droppable/");

		//driver.findElement(By.xpath("//a[text()='Demos']")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement src = driver.findElement(By.id("draggable"));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(src));

		WebElement target = driver.findElement(By.id("droppable"));
		wait.until(ExpectedConditions.visibilityOf(target));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();


	}

}
