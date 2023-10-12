package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//lauch the application 
		driver.get("http://laptop-mcihk329/login.do");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		//click on  Setting module 
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();

		//click on Logo & colour Scheme
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();

		//Select the Radio Button
		Thread.sleep(2000);
		driver.findElement(By.id("uploadNewLogoOption")).click();

		//Double click on choose File Button
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));

		Actions act = new Actions(driver);
		act.doubleClick(target).perform();

		Thread.sleep(2000);
		driver.close();





	}

}
