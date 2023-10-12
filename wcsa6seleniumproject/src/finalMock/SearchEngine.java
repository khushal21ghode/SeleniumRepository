package finalMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchEngine {

	public static void main(String[] args) {
		
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.get("https://www.google.com/");
		  driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		  
		  driver.switchTo().frame("app");
		  
		  driver.findElement(By.xpath("//span[text()='Maps']")).click();

	}

}
