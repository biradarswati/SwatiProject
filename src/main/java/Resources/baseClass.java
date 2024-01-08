package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseClass {

	public WebDriver driver;
	public Properties prop;
	
	public void driverInitilize() throws IOException {
		
		//this will read the properties file
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		//access the properties file
		 prop=new Properties();
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
		 driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome")) {
			//firefox
		}
		else if(browsername.equalsIgnoreCase("chrome")) {
			//firefox
		}
		else {
			System.out.println("please make sure you have correct browser");
	
		}
		
	}
	 @BeforeMethod
	 public void openurl() throws IOException {
		 driverInitilize();
			//this driver have scope
			
			String urlname=prop.getProperty("url");
			driver.get(urlname);
			
	 }
	@AfterMethod
	public void closeurl()throws IOException{
		driver.quit();
	}
	
	
	
	
	
	
	
}
