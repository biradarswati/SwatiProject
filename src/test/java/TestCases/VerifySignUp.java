package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObject;
import Resources.CommonMethods;
import Resources.baseClass;
import Resources.constants;

public class VerifySignUp extends baseClass{

	@Test
	public void signup() throws IOException, InterruptedException {
	
		driverInitilize();
		//this driver have scope
		driver.get("https://login.salesforce.com/");
		
	LoginPageObjects lpo=new LoginPageObjects(driver);
	lpo.clickOntryforfree().click();
	
	SignupPageObject spo=new SignupPageObject(driver);
	
	Thread.sleep(4000);
	
	spo.enterfirstname().sendKeys(constants.firstname);
	
	spo.enterlastname().sendKeys(constants.lastname);
	
	spo.selectjobtitle().sendKeys(constants.jobtitle);
	
	spo.enteremail().sendKeys(constants.email);
	
	spo.enterphone().sendKeys(constants.phone);

/*	Select s=new Select(spo.selectemployees());
	s.selectByIndex(1);
*/
	spo.entercompany().sendKeys(constants.company);
	

/*	Select s1=new Select(spo.selectcountry());
	s1.selectByIndex(1);
	*/
	
	CommonMethods.selectDropDown(spo.selectemployees(),1);
	
	CommonMethods.selectDropDown(spo.selectcountry(),1);

	
	
	
	
	
	
	
	
	}
}
