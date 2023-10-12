package JavaScritExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Argument;

public class HandleHiddenWebElement {

	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		//handle Hidden webElement
		WebElement ReadmoreButton = driver.findElement(By.xpath("//a[contains(@class,'selenium-button selenium-g')]"));
	     JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("arguments[0].click();",ReadmoreButton);

	}

}
