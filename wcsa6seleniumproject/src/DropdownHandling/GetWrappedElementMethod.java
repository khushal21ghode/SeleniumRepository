package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
                                                                                               
public class GetWrappedElementMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//to launch sinle  select dropdown                                    
		//driver.get("http://127.0.0.1:5500/SingleSelectDropdown.html");
		
		//to launch muti select dropdown
	    driver.get("http://127.0.0.1:5500/MultiSelectDropDown.html");            
		
		WebElement    Dropdownele= driver.findElement(By.id("i1"));
		
	           Select    sel=new Select(Dropdownele);
	           
	      // read all the options as considers a webelement                                     
	      WebElement    allopton= sel.getWrappedElement();
	      System.out.println(allopton.getText());
	}

}
                               