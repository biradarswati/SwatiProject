package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.CommonMethods;
import Resources.baseClass;
import Resources.constants;

public class VerifyLogin extends baseClass{

	@Test(dataProvider="testData")
	public void login(String uname,String password) throws IOException, InterruptedException {
		
	LoginPageObjects obj=new LoginPageObjects(driver);
	
	CommonMethods.handleAssertions(driver.getCurrentUrl(),"https://login.salesforce.com/" ,"url is not matching");
	
	obj.enterpassword().sendKeys(uname);
	
	obj.enterpassword().sendKeys(password);
	
	obj.clickOnLogin().click();
	
	
	CommonMethods.handleAssertions(obj.errorText().getText(),constants.expectederrormessage,"error message is matching" );
	
	}

 	@DataProvider
   public Object[][] testData(){
		
		Object[][]data=new Object[2][2];
		data[0][0]=constants.username1;
		data[0][1]=constants.password1;
		data[1][0]=constants.username2;
		data[1][1]=constants.password2;
			
		return data;
	}
	
}
