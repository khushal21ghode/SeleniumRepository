package KeyWordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./Data/config.properties");
		
		//read the data from config.properties
		Properties prop = new Properties();
		//make the file ready for read 
		prop.load(fis);
		//read any which you want from property file 
		String propertyData = prop.getProperty("Browser");
		System.out.println(propertyData);


	}

}
