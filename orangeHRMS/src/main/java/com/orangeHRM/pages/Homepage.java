package com.orangeHRM.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Baseclass{

	public Homepage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	//object repository or page factory
		@FindBy(linkText="Welcome Admin")
		WebElement Welcomeadmin;
		
		@FindBy(xpath="//b[contains(text(),'Admin')]")
		WebElement AdminModule;
		
		@FindBy(xpath="//b[contains(text(),'PIM')]")
		WebElement PIMModule;
		
				
		@FindBy(xpath="//b[contains(text(),'Leave')]")
		WebElement LeaveModule;
		
		@FindBy(xpath="//b[contains(text(),'Time')]")
		WebElement TimeModule;
		
		@FindBy(xpath="//b[contains(text(),'Recruitment')]")
		WebElement RecruitmentModule;
		
		@FindBy(xpath="//b[contains(text(),'Performance')]")
		WebElement PerformanceModule;
		
		@FindBy(xpath="//b[contains(text(),'Dashboard')]")
		WebElement DashboardModule;
		
		@FindBy(xpath="//b[contains(text(),'Directory')]")
		WebElement DirectoryModule;
		
		@FindBy(xpath="//input[@value='Add'][@name='btnAdd']")
		WebElement Addbutton;
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		public Users Adminmodulelink() throws Exception{
			AdminModule.click();
			return new Users();
		}
		
		public Employeelist Pimmodulelink() throws Exception{
			PIMModule.click();
			return new Employeelist();
		}
		public Addemployee Addbuttonlink() throws Exception{
			Addbutton.click();
			return new Addemployee();
		}
		

		
}
