package testNGAnnotations_Flags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSerachTestCase extends BaseTest{
  @Test
  public void Serach_in_java() {
	  
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  
  @Test
  public void Serach_in_selenium() {
	  
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
  }
}
