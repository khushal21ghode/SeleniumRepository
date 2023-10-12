package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//faceBooK sign in page
public class Xpath4 {
   public static void main(String[] args) throws InterruptedException {
	 //Xpath by using to launch automate facebook sigin page
	WebDriver  driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("khushal");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ghode");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("khushalghode1234@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("khushalghode1234@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("khushal12345");
	Thread.sleep(2000);
	Select obj1=new Select(driver.findElement(By.id("day")));
	obj1.selectByIndex(20);
	Thread.sleep(2000);
	Select obj3=new Select(driver.findElement(By.id("month")));
	obj3.selectByIndex(8);
	Thread.sleep(2000);
	Select obj=new Select(driver.findElement(By.id("year")));
	obj.selectByIndex(24);
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("websubmit")).click();
	
}

}
