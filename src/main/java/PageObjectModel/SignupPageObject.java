package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {

	//added one new line for demo purpose
	public WebDriver driver;
	
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By jobtitle=By.xpath("//input[@name='UserTitle']");
	private By email=By.xpath("//input[@name='UserEmail']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By company=By.xpath("//input[@name='CompanyName']");
    private By country=By.xpath("//select[@name='CompanyCountry']");
    
	
    
    
	public SignupPageObject(WebDriver driver2) {

		this.driver=driver2;
	
	
	
	}
	public WebElement enterfirstname() {
    	return driver.findElement(firstname);
    }
    public WebElement enterlastname() {
    	return driver.findElement(lastname);
    }
    public WebElement selectjobtitle() {
    	return driver.findElement(jobtitle);
    }
    public WebElement enteremail() {
    	return driver.findElement(email);
    }
    public WebElement enterphone() {
    	return driver.findElement(phone);
    }
    public WebElement selectemployees() {
    	return driver.findElement(employees);
    }
    public WebElement entercompany() {
    	return driver.findElement(company);
    }
    public WebElement selectcountry() {
    	return driver.findElement(country);
    }
	
}
