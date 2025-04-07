package Aictec.Wejha.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Aictec.Wejha.pages.Accountcreationpage;
import Aictec.Wejha.pages.Loginpage;
import dataproviders.Accountconfigfilereader;
import dataproviders.LoginconfigFileReader;

public class Accountcreationpagetests {
	Accountcreationpage ac;
	public Accountcreationpagetests(WebDriver driver) {
		super();
		this.driver = driver;
		this.ac = ac;
	}

	WebDriver driver;
	

public void accountCreation() throws InterruptedException, IOException {
	ac= new Accountcreationpage(driver);
	ac.getCompanyname();
	ac.getTaxid();
	ac.getPhonenumber();
	ac.getCompanymail();
	ac.getaddress();
	ac.selectCountry();
	ac.selectState();
	ac.selectCity();
	ac.getPincode();
	ac.getUserFullname();
	ac.getusername();
	ac.getUsermail();
	ac.getPassword();
	ac.clickcreatebutton();
	ac.iferrorexiststakescreenshot(driver);
}
}