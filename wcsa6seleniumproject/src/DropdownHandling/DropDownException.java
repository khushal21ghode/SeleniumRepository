package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownException {

	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	         
	   driver.get("http://127.0.0.1:5500/SingleSelectDropdown.html");
	   WebElement    Dropdown = driver.findElement(By.id("i1"));
	   
	    Select   sel=new Select(Dropdown);
	    Thread.sleep(2000);
	     sel.selectByValue("V2");
	    
	     
	     // deselect the option from single select dropdown
	     Thread.sleep(2000);
	     sel.deselectByIndex(3);
	       
	       
	             

	}

}
