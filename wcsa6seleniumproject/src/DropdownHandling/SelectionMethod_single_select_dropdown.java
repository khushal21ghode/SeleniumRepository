package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod_single_select_dropdown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("http://127.0.0.1:5500/SingleSelectDropdown.html");
		 //handle dropdown by using select class
		 
		 //identify dropdown single select
		  WebElement   dropdownele=driver.findElement(By.name("menu"));
		  
		  //Create object for Select class to access method select class
		   Select   sel = new Select(dropdownele);
		   
		   Thread.sleep(4000);
		   sel.selectByIndex(1);  //select option according to the index value
		   
		   Thread.sleep(4000);
		   sel.selectByVisibleText("Vadapav");// select option according to the visible text
		   
		   Thread.sleep(4000);
		   sel.selectByValue("V5");  //select option according to the value	
		   
		   
		   
		  

		   
		    
		  
		  
		 

	}

}
