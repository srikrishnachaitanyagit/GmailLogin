package com.gmail.testcases;

import org.testng.annotations.Test;

import com.gmail.pageobjects.LoginPageObjects;
import com.gmail.pageobjects.RegistrationPageObjects;


public class Registration extends BaseClass {

	@Test
	public void registration(){
		System.out.println("Driver is:"+driver);
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
		logger.info("Creating RegistrationPageObject");
		rpo.registartionbtnclick();
		rpo.patientcategorydd("Self");
		rpo.titledd("Mr.");
		rpo.firstnametxtregistration("sri");
		rpo.middlenametxtregistration("krishna");
		rpo.lastnametxtregistration("chaitanya");
		rpo.dobregistration("22-06-1992");
		rpo.agetxtregistartion("28");
		rpo.genderdd("Male");
		rpo.maritalstatus("Married");
		rpo.religionstatus("Hindu");
		rpo.primarylanguagedd("Telugu");

		rpo.relationdd("Father");
		rpo.mothersmaidennametext("Lakshmi");
		rpo.patientidentifierdd("PAN Card");
		rpo.pantext("56456Wer");

		rpo.nationalitydd("Indian");
		rpo.vipdd("No");
		rpo.educationdd("MCA");
		rpo.occupationdd("Employee");
		rpo.bloodgroupdd("A+");
		rpo.citizenshipdd("Indian");
		rpo.seniorcitizendd("No");

		rpo.addressfirsttext("4th cross, marthalli");
		rpo.phonetext("+91 8125222770");
		rpo.emailtext("chaitanya.pskc@gmail.com");
		rpo.countrydd("India");

		rpo.secondaddress("nellore, andhrapradesh");
		rpo.pintext("524305");
		logger.info("Enter Details Successfully");
	}



}
