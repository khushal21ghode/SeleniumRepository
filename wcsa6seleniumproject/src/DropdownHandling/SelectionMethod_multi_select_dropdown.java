package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod_multi_select_dropdown {

	public static void main(String[] args) throws InterruptedException {
	     WebDriver     driver=new ChromeDriver();   
	     driver.manage().window().maximize();
	     //use implicit wait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     driver.get("http://127.0.0.1:5500/MultiSelectDropDown.html"); 
	     
	     //identify multi select dropdown 
	      WebElement   dropDown =driver.findElement(By.id("i1"));
	      
	      //create object for Select class to acess method of Select class
	       Select  sel=new Select(dropDown);
	       
	       //select random option from dropdown by using Selection Method 
	        Thread.sleep(2000);
	        sel.selectByIndex(3);
	        Thread.sleep(2000);
	        sel.selectByVisibleText("kachori");
	        Thread.sleep(2000);
	        sel.selectByValue("V8");
	        
//	        
//	   //    select multiple options from Dropdown  by using selectByindex method 
//	       for(int i=0;i<=3;i++)
//	       {   
//	       	  Thread.sleep(4000);
//	       	 sel.selectByIndex(i);
//	        
//	       }
	       
	       
	   //    select multiple options from Dropdown  by using SelectbyValue method 
//	       
//	      String arr[]= {"V1","V2","V3","V4","V5"};
//	       for(int i=0;i<=arr.length;i++)
//	       {
//	    	   sel.selectByValue(arr[i]);
//	       }
	       
	       
	  //      select multiple options from Dropdown  by using selectbyvisibleText method 
//	       
//	       String arr1[]= {"Idli","Misalpav","Vadapav","Poha"};
//	      for(int i=0;i<=arr1.length;i++)
//	       {   
//	    	   Thread.sleep(2000);
//	    	   sel.selectByVisibleText(arr1[i]);
//	       }
//	       
	       
	        
	         

	}

}
