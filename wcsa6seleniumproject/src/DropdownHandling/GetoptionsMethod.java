package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.EqualsMethod;

public class GetoptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//use to launch multiple dropdown 
		//	 driver.get("http://127.0.0.1:5500/MultiSelectDropDown.html");

		// use to launch single select dropdown 
		driver.get("http://127.0.0.1:5500/SingleSelectDropdown.html");


		WebElement   Dropdown=driver.findElement(By.id("i1"));
		Select   sel=new Select(Dropdown);

		//to read all the options from the dropdown 
		List<WebElement>   alloptions=sel.getOptions();

		//use to read all the options by using for loop 
		for(int i=0;i<alloptions.size();i++)
		{
			String   opt =alloptions.get(i).getText();
			System.out.println(opt);
		}

		//    how to select options from dropdown without using selection method 
		//             for(int i=0;i<alloptions.size();i++)
		//             {
		//            	 if(alloptions.get(i).getText().equals("Misalpav"))
		//            	 {
		//            		 Thread.sleep(4000);
		//            		 alloptions.get(i).click();
		//            		 break;
		//            	 }
		//              }


	}

}
