package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	//this driver dont have scope
	public WebDriver driver;
	
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By tryforfree=By.xpath("//a[@id='signup_link']");
	private By errorMessage=By.xpath("//div[@id='error']");
	
	public LoginPageObjects(WebDriver driver2) {
        this.driver=driver2;
	}
	
	
	public WebElement enterusername() {	
		return driver.findElement(username);
	}
	
	public WebElement enterpassword() {	
			return driver.findElement(password);		
		}	

	public WebElement clickOnLogin() {	
			return driver.findElement(login);
			
	}	
	public WebElement clickOntryforfree() {	
		return driver.findElement(tryforfree);
	}	
	
	public WebElement errorText() {	
		return driver.findElement(errorMessage);
	}	
	
		
			
		
		
		
		
		
		
	
	
	
}
