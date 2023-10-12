package testNGAnnotations_Flags;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Flag7 {
	@Test(description = "perfroms Login")
	  public void LoginMethod() 
	  {
		  System.out.println("It is use to perfrom Login");
	  }
	  
	  @Test(description = "perfrom create user" ,dependsOnMethods = "LoginMethod")
	  public void createuserMethod() 
	  {  
		  Assert.fail();
		  System.out.println("user created");
	  }
	  
	  @Test(description = "perfrom Logout",dependsOnMethods = "createuserMethod",alwaysRun = true)
	  public void LogoutMethod() 
	  {
		  System.out.println("It is use to perfrom Logout");
	  }
}
