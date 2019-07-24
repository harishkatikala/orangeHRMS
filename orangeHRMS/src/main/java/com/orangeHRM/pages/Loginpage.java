package com.orangeHRM.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import Academy.HomePage;

public class Loginpage extends Baseclass {

	public Loginpage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	
	
	//object repository or page factory
	@FindBy(name="txtUsername")
	WebElement txtUsername;
	
	@FindBy(name="txtPassword")
	WebElement txtPassword;
	
	@FindBy(xpath=".//*[@value='LOGIN']")
	WebElement LoginButton;
	
	public String validateloginPageTitle(){
		return driver.getTitle();
		
	}
	
	public Homepage login(String un,String pwd) throws Exception{
		txtUsername.sendKeys(un);
		txtPassword.sendKeys(pwd);
	    LoginButton.click();
	return new Homepage(); // navigating to home page once login was success or landing page
	    	   
	}

	public String validateLoginpageTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}
