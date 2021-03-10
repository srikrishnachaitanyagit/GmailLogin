package com.gmail.testcases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.gmail.pageobjects.LoginPageObjects;
import com.gmail.pageobjects.RegistrationPageObjects;


public class Login extends BaseClass{

	@Test
	public void loginPage() throws InterruptedException, IOException {
		System.out.println("driver is:"+driver);
		System.out.println("Enter into Test Case");
		LoginPageObjects loginobj = new LoginPageObjects(driver);
		logger.info("LoginPageObject created Successfully");
		Thread.sleep(3000);
		loginobj.user("admin");
		logger.info("Entered User");
		Thread.sleep(3000);
		loginobj.pwd("admin");
		logger.info("Entered pwd");
		loginobj.loginButton.click();
		logger.info("click login button");
		screencapture(driver, "loginpage");
		//loginobj.logoutButton.click();
	}
	
	


}
