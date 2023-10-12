package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://demo.guru99.com/test/drag_drop.html");
        
		//identify src weblElement
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement    src2= driver.findElement(By.xpath("//a[text()=' 5000']"));

		WebElement      src3= driver.findElement(By.xpath("//a[text()=' BANK ']"));

		WebElement   src4=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		//-------------------------------------------------------------------------------
		//identify target 
		WebElement target1=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement  target2      = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		WebElement target3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement  target4      = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		//perfrom the drag and drop option 
		   Actions    act=new Actions(driver);
		   act.dragAndDrop(src1, target1).perform();
		   Thread.sleep(2000);
		   act.dragAndDrop(src2, target2).perform();
		   Thread.sleep(2000);
		   act.dragAndDrop(src3, target3).perform();
		   Thread.sleep(2000);
		   act.dragAndDrop(src4, target4).perform();
		   
		
		




	}

}
