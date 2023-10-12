package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.get("http://127.0.0.1:5500/MultiSelectDropDown.html");
		  WebElement     Dropdown=driver.findElement(By.id("i1"));
		  
		 // create an object for Select class to acces method of select class
		        Select    sel=new Select(Dropdown);
		        
		 //   select single option from multiselect dropdown
		    sel.selectByIndex(3);
		    Thread.sleep(2000);
		//     deselect single option from multiselect dropdown
		    sel.deselectByIndex(3);
		    
		    
		    
		//    select multiple option from dropdown by using selctByindex method 
		    for(int i=0;i<3;i++)
		     {   
		    	Thread.sleep(2000);
		    	sel.selectByIndex(i);
		     }
		  //  deselect multiple option by using deselctByindex method 
		    
		     for(int i=0;i<3;i++)
		    {  
		    	Thread.sleep(2000);
		    	sel.deselectByIndex(i);
		    }
		     
		     //select multiple option from dropDown By using selectbyvalue() method
		     String [] arr={"V1","V2","V3"};
		      for(int i=0;i<arr.length;i++)
		     {
		    	  Thread.sleep(2000);
		    	  sel.selectByValue(arr[i]);
		      }
		      
		      //deselect multiple option from dropDown By using 
		       // deselectByValue();
		      for(int i=0;i<arr.length;i++)
		      {
		    	  Thread.sleep(2000);
		    	  sel.deselectByValue(arr[i]);
		      }
		      
		      
		      //select multiple option from dropdown By using selectByvissibletext() method 
		      String arr1[]= {"Idli","Misalpav","Vadapav","Poha"};
		     for(int i=0;i<arr1.length;i++)
		       {   
		    	   Thread.sleep(2000);
		    	   sel.selectByVisibleText(arr1[i]);
		       }
		      
		    //deselect multiple option from dropdown By using deselectByvissibletext() method
		      
		      for(int i=0;i<arr1.length;i++)
		       {   
		    	   Thread.sleep(2000);
		    	   sel.deselectByVisibleText(arr1[i]);
		       }
		      
		      
		      
		      
		      //select multiple option from dropdown By using selectByvissibletext() method 
		      sel.selectByVisibleText("Poha");
		      Thread.sleep(2000);
		      sel.deselectAll();
		      
		      for(int i=0;i<3;i++)
			     {
			    	 Thread.sleep(2000);
			     	 sel.selectByIndex(i);
			     }
			     Thread.sleep(2000); 
			     sel.deselectAll();
		      
		      
		      
		      
		     
		     
		    
		  	

	}

}
