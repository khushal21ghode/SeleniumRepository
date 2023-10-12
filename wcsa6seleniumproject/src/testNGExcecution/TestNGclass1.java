package testNGExcecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGclass1 {
  @Test
  public void Method1() {
	  
	  Reporter.log("TestNGclass1 : Method1", true);
  }
 @Test 
public void Method2() {
	  
	  Reporter.log("TestNGclass1 : Method2", true);
  }
}
