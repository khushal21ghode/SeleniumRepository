package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enableFlag {
  
	@Test(description ="perfrom login" ,enabled=true)
	  public void  method1() 
	  {
		Reporter.log("Method1", true);  
	  }
	  
	  @Test(description ="Perfrom create User" ,enabled =false)
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
