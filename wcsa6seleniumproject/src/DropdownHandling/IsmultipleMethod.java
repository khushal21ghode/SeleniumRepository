package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsmultipleMethod {
            public static void main(String[] args) {
		  WebDriver	driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  //use to launch single select dropdown 
		 // driver.get("http://127.0.0.1:5500/SingleSelectDropdown.html");
		  
		  //use to launch multi select dropdown
		  driver.get("http://127.0.0.1:5500/MultiSelectDropDown.html");
		  
		   WebElement  Dropdownele=driver.findElement(By.id("i1"));
		   
		// to check whether the dropdown is single select or multi select
		   Select    sel=new Select(Dropdownele);
		    System.out.println(sel.isMultiple());
		  
		 
		  
 }
}
