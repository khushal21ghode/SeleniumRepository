package MethodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlePageMethod {
  public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/?affid=affsiteplug&affExtParam1=fdecbb4e876bf3cd7d35abaff320e85a&affExtParam2=52664)");
   String Titleofwebpage = driver.getTitle();
   System.out.println(Titleofwebpage);
   driver.close();
}
}
