package com.gmail.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	public static WebDriver driver;

	public LoginPageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(name="username")
	public static WebElement usernameTxt;
	@FindBy(name="password")
	public static WebElement passwordTxt;
	@FindBy(name="submit")
	public static WebElement loginButton;
	@FindBy(linkText="Logout")
	public static WebElement logoutButton;



	public void user(String user){
		usernameTxt.sendKeys(user);
	}

	public void pwd(String pwd){
		passwordTxt.sendKeys(pwd);
	}

	public void loginclick(){
		loginButton.click();
	}
	
	public void logoutclick(){
		logoutButton.click();
	}

}
