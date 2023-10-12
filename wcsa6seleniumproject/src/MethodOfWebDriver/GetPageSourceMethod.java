package MethodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
         
	// it is used to get the source code of current web page
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		 
		//launch web application of actitime of login page
		driver.get("http://127.0.0.1/login.do");
		
		//read the source code of login page
		String loginpagesourcecode  = driver.getPageSource();
		System.out.println(loginpagesourcecode);
		
	}
}
