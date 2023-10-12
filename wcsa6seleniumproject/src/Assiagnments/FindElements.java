package Assiagnments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
    public static void main(String[] args) throws InterruptedException {
    //print all the laptop names and their price in console output 
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	//Search laptop on search text box 
	driver.findElement(By.name("q")).sendKeys("laptop");
	driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
	
	//apply filter processor 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i5']")).click();
	
	//apply filter Brand 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
	
	//apply filter operating system
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
	
	//apply fiter customer rating
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
	
	//identify all sugesstion of loptop )
	List<WebElement>  allSuggestion =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	//identify all the suggestion price of laptop
	List<WebElement> allPriceSuggestion=driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	Thread.sleep(2000);
	
	//use looping statements to read the list of laptop names and price 
	for(int i=0;i<allSuggestion.size();i++)
	{  
	  
	  String namesOfLaptop =allSuggestion.get(i).getText();
	  Thread.sleep(2000);
	   for(int j=i;j<=i;j++)
	  {
	
		String       priceOfLaptop=allPriceSuggestion.get(j).getText();
		System.out.println(namesOfLaptop+"    :"+priceOfLaptop );
		Thread.sleep(2000);
	  }
	   System.out.println();
	}
	Thread.sleep(2000);
	driver.quit();
	}
}
