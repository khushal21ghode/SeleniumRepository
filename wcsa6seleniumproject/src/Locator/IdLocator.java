package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
   public static void main(String[] args) throws InterruptedException {
	  //with help id locator amezonprimeSigninpage
	   WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fregion%2Feu%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3DsgwH1dAc7QTbBUlIq4esIuRgHko7A8MeOiivkgxOdLkMqAAAAAQAAAABktqT_cmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fregion%2Feu%2F%3Fref_%253Datv_auth_pre&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=259-8501990-7557169&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  
	   //identify the email text field by id locator
	   Thread.sleep(2000);
	   driver.findElement(By.id("ap_email")).sendKeys("khushal@123");
	   
	   //identify the password text field by id locator
	    Thread.sleep(2000);
	   driver.findElement(By.id("ap_password")).sendKeys("pass123");
	   
	   Thread.sleep(2000);
	   driver.findElement(By.id("signInSubmit")).click();
	   
}
}
