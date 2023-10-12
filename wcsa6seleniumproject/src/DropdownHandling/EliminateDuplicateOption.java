package DropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateOption {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));                       

		//to launch the multiselect dropdown 
		driver.get("http://127.0.0.1:5500/MultiSelectDropDown.html");
		WebElement   Dropdown=driver.findElement(By.name("menu"));
		Select     sel=new Select(Dropdown);

		// to handle dropdown by eliminate duplicate we use HashSet                   
		HashSet<String> hs=new HashSet<String>();                  


		//read all the option from dropdown 
		List<WebElement>    allOps=sel.getOptions();

		// read list by eliminating duplicate
		for(int i=0;i<allOps.size();i++)
		{
			// get the text of ops to add in set
			String text = allOps.get(i).getText();

			// add text into HashSet
			hs.add(text);
		}



		for(String opt:hs)
		{
			Thread.sleep(2000);
			System.out.println(opt);
		}










	}

}
