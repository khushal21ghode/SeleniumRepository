package testNGAnnotations_Flags;

import org.testng.annotations.Test;

public class DependsOnMethod_Flag {
  @Test(description = "perfroms Login")
  public void LoginMethod() 
  {
	  System.out.println("It is use to perfrom Login");
  }
  
  @Test(description = "perfrom create user" ,dependsOnMethods = "LoginMethod")
  public void createuserMethod() 
  {
	  System.out.println("user created");
  }
  
  @Test(description = "perfrom Logout",dependsOnMethods = "createuserMethod")
  public void LogoutMethod() 
  {
	  System.out.println("It is use to perfrom Logout");
  }
}
