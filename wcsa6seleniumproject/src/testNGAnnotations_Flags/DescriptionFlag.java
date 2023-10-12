package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description ="perfrom login")
  public void  method1() 
  {
	Reporter.log("Method1", true);  
  }
  
  @Test(description ="Perfrom create User")
  public void  method2() 
  {
	Reporter.log("Method2", true);  
  }
  
  @Test(description ="perfrom LogOut")
  public void  method3() 
  {
	Reporter.log("Method3", true);  
  }
}
