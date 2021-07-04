package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;

public class Loginpage {
	
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	
	public Loginpage()
	{
		driver=Baseclass.driver;
		report=Baseclass.report;
		test=Baseclass.test;
		PageFactory.initElements(driver, this);

		
	}
	
	// ==== WebElements : loginPage ===
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="login-button")
	WebElement loginsubmit;

	
	public void login(String uname, String pwd)
	{
      
	
        
	    username.sendKeys(uname);
	    
	   // test.log(LogStatus.PASS, "successfully entered username");

	          
	    password.sendKeys(pwd);
	    
	   // test.log(LogStatus.PASS, "successfully entered password");

	    	    
	    loginsubmit.click();

    
    
}
	
	
    
}



