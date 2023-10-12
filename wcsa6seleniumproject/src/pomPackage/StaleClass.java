package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-mcihk329/login.do");

		WebElement UsnTb = driver.findElement(By.name("username"));
		UsnTb.sendKeys("admin");
//		System.out.println(UsnTb);
//		driver.findElement(By.name("pwd")).sendKeys("manager1");
//		driver.findElement(By.id("loginButton")).click();
//
//		WebElement usn = driver.findElement(By.name("username"));
//		usn.clear();
//		System.out.println(usn);
		
		
		System.out.println(UsnTb);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		UsnTb.sendKeys("admin123");
		
		
		
		







	}

}
