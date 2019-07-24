package com.orangeHRM.testcasescripts;

import org.testng.annotations.Test;

import com.orangeHRM.pages.Baseclass;
import com.orangeHRM.pages.Loginpage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class LoginpageTest extends Baseclass{
	com.orangeHRM.pages.Homepage hp;
	com.orangeHRM.pages.Loginpage lp;
	private String loginpageimg;
	
	
  public LoginpageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
  @BeforeTest
  public void setup() throws Exception  {
	  initialization();
	  lp=new Loginpage();
	  
  }
  @Test(priority = 1)
  public void loginpagetitletest() {
	  String title=lp.validateloginPageTitle();
	  Assert.assertEquals(title,"OrangeHRM");
}
  @Test(priority = 2)
  public void LoginpageTest() throws Exception {
	  takescreenshot("loginpageimg");
	  hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
	  
  }
  
  

  @AfterTest
  public void teardown() {
  }

}
