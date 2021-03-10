package com.gmail.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageObjects {
	
	public static WebDriver driver;
	
	public RegistrationPageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(partialLinkText="Registration")
	public static WebElement registartionBtn;
	@FindBy(name="PATIENT_CAT")
	public static WebElement patientcategorydropdown;
	@FindBy(name="TITLE")
	public static WebElement titledropdown;
	@FindBy(name="PNT_NAME")
	public static WebElement firstnameTxt;
	@FindBy(name="MIDDLE_NAME")
	public static WebElement middlenameTxt;
	@FindBy(name="LAST_NAME")
	public static WebElement lastnameTxt;
	@FindBy(name="DOB")
	public static WebElement caleneder;
	@FindBy(name="AGE")
	public static WebElement ageTxt;
	@FindBy(name="SEX")
	public static WebElement genderdropdown;
	@FindBy(name="MTRL_STATUS")
	public static WebElement maritalstatusdropdown;
	@FindBy(name="RELIGION")
	public static WebElement religiondropdown;
	@FindBy(name="PLANGUAGE")
	public static WebElement primarylanguagedropdown;
	
	@FindBy(name="RELATION")
	public static WebElement relationdropdown;
	@FindBy(name="MOTHER_NAME")
	public static WebElement mothersmaidennameTxt;
	@FindBy(name="PAT_IDENTITY")
	public static WebElement patientidentifierdropdown;
	@FindBy(name="PAT_IDENTITY_PROOF")
	public static WebElement panTxt;
	
	
	@FindBy(name="NATIONALITY")
	public static WebElement nationalitydropdown;
	@FindBy(name="IS_MLC")
	public static WebElement vipdropdown;
	@FindBy(name="EDUCATION")
	public static WebElement educationdropdown;
	@FindBy(name="OCCUPATION")
	public static WebElement occupationdropdown;
	@FindBy(name="BLOOD_GRP_CODE")
	public static WebElement bloodgroupdropdown;
	@FindBy(name="CITIZENSHIP")
	public static WebElement citizenshipdropdown;
	@FindBy(name="SC_PROOF")
	public static WebElement seniorcitizendropdown;
	
	@FindBy(name="ADDRESS1")
	public static WebElement address1Txt;
	@FindBy(name="MOBILE_NO")
	public static WebElement phoneTxt;
	@FindBy(name="EMAIL_ID")
	public static WebElement emailTxt;
	@FindBy(name="COUNTRY_CODE")
	public static WebElement countrydropdown;
	
	@FindBy(name="ADDRESS2")
	public static WebElement address2Txt;
	@FindBy(name="ZIP")
	public static WebElement pinTxt;
	
	
	public void registartionbtnclick(){
		registartionBtn.click();
	}
	
	public void patientcategorydd(String patientcat){
		Select sel = new Select(patientcategorydropdown);
	    sel.selectByVisibleText(patientcat);
	}
	
	public void titledd(String title){
    Select sel = new Select(titledropdown);
    sel.selectByVisibleText(title);
    }
	
	public void firstnametxtregistration(String firstname){
		firstnameTxt.sendKeys(firstname);
	}
	
	public void middlenametxtregistration(String middlename){
		middlenameTxt.sendKeys(middlename);
	}
	
	public void lastnametxtregistration(String lastname){
		lastnameTxt.sendKeys(lastname);
	}
	
	public void dobregistration(String ddmmyyyy){
		caleneder.sendKeys(ddmmyyyy);
	}
	
	public void agetxtregistartion(String num){
		ageTxt.sendKeys(num);
	}
	
	public void genderdd(String gender){
		Select sel = new Select(genderdropdown);
		sel.selectByVisibleText(gender);
	}
	
	public void maritalstatus(String status){
		Select sel = new Select(maritalstatusdropdown);
		sel.selectByVisibleText(status);
	}
	
	public void religionstatus(String religion){
		Select sel = new Select(religiondropdown);
		sel.selectByVisibleText(religion);
	}
	
	public void primarylanguagedd(String prlang){
		Select sel = new Select(primarylanguagedropdown);
		sel.selectByVisibleText(prlang);
	}
	
	
	public void relationdd(String relation){
		Select sel = new Select(relationdropdown);
		sel.selectByVisibleText(relation);
	}
	
	public void mothersmaidennametext(String mname){
		mothersmaidennameTxt.sendKeys(mname);
	}
	
	public void patientidentifierdd(String pid){
		Select sel = new Select(patientidentifierdropdown);
		sel.selectByVisibleText(pid);
	}
	
	public void pantext(String pan){
		panTxt.sendKeys(pan);
	}
	
	public void nationalitydd(String nationality){
		Select sel = new Select(nationalitydropdown);
		sel.selectByVisibleText(nationality);
	}
	
	public void vipdd(String vip){
		Select sel = new Select(vipdropdown);
		sel.selectByVisibleText(vip);
	}
	
	public void educationdd(String education){
		Select sel = new Select(educationdropdown);
		sel.selectByVisibleText(education);
	}
	
	public void occupationdd(String occupation){
		Select sel = new Select(occupationdropdown);
		sel.selectByVisibleText(occupation);
	}
	
	public void bloodgroupdd(String bloodgroup){
		Select sel = new Select(bloodgroupdropdown);
		sel.selectByVisibleText(bloodgroup);
	}
	
	public void citizenshipdd(String citizenship){
		Select sel = new Select(citizenshipdropdown);
		sel.selectByVisibleText(citizenship);
	}
	
	public void seniorcitizendd(String seniorcitizen){
		Select sel = new Select(seniorcitizendropdown);
		sel.selectByVisibleText(seniorcitizen);
	}
	
	
	public void addressfirsttext(String address){
	address1Txt.sendKeys(address);
	}
	
	public void phonetext(String phone){
		phoneTxt.sendKeys(phone);
		}
	
	public void emailtext(String email){
		emailTxt.sendKeys(email);
		}
	
	public void countrydd(String country){
		Select sel = new Select(countrydropdown);
		sel.selectByVisibleText(country);
	}
	
	public void secondaddress(String secadd){ 
	address2Txt.sendKeys(secadd);
	}
	
	public void pintext(String pin){ 
		pinTxt.sendKeys(pin);
		}
	
	
	
}//close class
