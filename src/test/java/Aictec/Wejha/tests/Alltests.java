package Aictec.Wejha.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Aictec.Wejha.pages.Loginpage;
import dataproviders.LoginconfigFileReader;

public class Alltests {
	WebDriver driver;
    Logintests login;
	homePagetests homepage;
	Accountcreationpagetests accountcreation;
	
	@BeforeTest
	public void firstStep() {
		LoginconfigFileReader config=new LoginconfigFileReader();
		System.setProperty("webdriver.chrome.driver",config.getDriverPath());
		driver = new ChromeDriver();
    	Loginpage lp=new Loginpage(driver);
		driver.get(config.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
	public void accountCreation() throws InterruptedException, IOException {
		login=new Logintests(driver);
		login.login();
		homepage= new homePagetests(driver);
		homepage.newAccountclick();
		accountcreation = new Accountcreationpagetests(driver);
		accountcreation.accountCreation();
		
	
}
}
