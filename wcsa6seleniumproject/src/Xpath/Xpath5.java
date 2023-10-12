package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath5 {
  //Xpath by using to automate vistarairline
	 
	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions   co=new ChromeOptions();
		 co.addArguments("--disable-notifications");
	
	//---------------------------------------------
	 WebDriver driver=new ChromeDriver(co);
	 
	 
	driver.manage().window().maximize();
	driver.get("https://www.airvistara.com/in/en");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@placeholder,'Select Departure City') and (contains(@name,'flightSearchFrom'))]")).sendKeys("Pune");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@placeholder,'Select Arrival City') and (contains(@aria-label,'Search destination'))]")).sendKeys("kochi");
	Thread.sleep(2000);
	
	driver.findElement(By.id("departCalendar")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='28']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()=' Jul ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='2023']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='31']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Search Flights']")).click();


	}
}
