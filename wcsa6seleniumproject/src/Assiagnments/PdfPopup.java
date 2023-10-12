package Assiagnments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PdfPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
         WebDriver   driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         //launch web application 
         driver.get("https://www.ilovepdf.com/word_to_pdf");
         
         driver.findElement(By.id("pickfiles")).click();
         Thread.sleep(2000);
         
           File file = new File("./Autoitfiles/Wordfileupload.exe");
           
            String abspath = file.getAbsolutePath();
            Thread.sleep(2000);
            
            Runtime.getRuntime().exec(abspath);
            
            
            
           

	}

}
