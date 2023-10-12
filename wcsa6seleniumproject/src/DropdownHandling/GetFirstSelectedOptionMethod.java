package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to launch muti select dropdown
		driver.get("http://127.0.0.1:5500/MultiSelectDropDown.html");
		
		//to launch single selct dropdown 
		//driver.get("http://127.0.0.1:5500/SingleSelectDropdown.html");
		
		WebElement   Dropdown=driver.findElement(By.id("i1"));
		
		//to create an obect for Select class
		 Select    sel=new Select(Dropdown);
		
		 // to select multiple option buy using loop 
		 for(int i=1;i<4;i++)
		 {
			 Thread.sleep(2000);
			 sel.selectByIndex(i);
		 }
		 
		 
		 // get the option that are selected first
		   WebElement  opt  =sel.getFirstSelectedOption();
		   System.out.println(opt.getText());
		 
		 

	}

}
