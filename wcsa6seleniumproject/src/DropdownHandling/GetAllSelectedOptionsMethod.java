package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		//use to launch multi select dropdown
		driver.get("http://127.0.0.1:5500/MultiSelectDropDown.html");
		
		//use to launch single select dropdown
		//driver.get("http://127.0.0.1:5500/SingleSelectDropdown.html");
		
		
         WebElement  Dropdown=driver.findElement(By.id("i1"));
         
         Select  sel=new Select(Dropdown);
        
         //To select options from dropdown 
         for(int i=0;i<4;i++)
         {
        	 Thread.sleep(3000);
        	 sel.selectByIndex(i);
         }
         Thread.sleep(5000);
         
         //to read the options that are all the slected 
           List<WebElement>     allopt=sel.getAllSelectedOptions();
           
           //to read the options by using for loop 
           for(int i=0;i<allopt.size();i++)
           {
        	  String  opt= allopt.get(i).getText();
        	  System.out.println(opt);
           }
         
	}

}
