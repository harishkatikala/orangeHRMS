package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addemployee extends Baseclass {

	public Addemployee() throws Exception{
		super();
	}
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="middleName")
	WebElement middlename;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(xpath=".//*[@id='btnSave']")
	WebElement savebutton;
	
		
	public String AddEmployeePageTitle(){
		return driver.getTitle();
		
	}
	public Personaldetails createnewuser(String fname,String mname,String lname){
		firstname.sendKeys(fname);
		middlename.sendKeys(mname);
		lastname.sendKeys(lname);
		savebutton.click();
		return new Personaldetails();
		
	}
}

