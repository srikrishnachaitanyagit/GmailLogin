package com.gmail.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.utils.FileUtil;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;


public class BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeSuite
	public void setup(){
		
		logger = Logger.getLogger("GmailLogin");
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		logger.info("Firefox Browser opened Successfully");
		driver.manage().window().maximize();
		logger.info("Maximize the Browser Window");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		logger.info("Applied Implicit Wait");
	    driver.get("http://www.seleniumbymahesh.com/HMS/");
	    logger.info("URL opened Successfully");
		
		}
	
	
	
	@AfterSuite
	public void teardown(){
	  // driver.close();
	 //  driver.quit();
	}
	
	
	public void screencapture(WebDriver driver, String tname) throws IOException{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}
	
	public String randomStringGenerator(){
		String randomstring = RandomStringUtils.randomAlphabetic(6);
		return randomstring;
		}
	
	

}
