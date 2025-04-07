package Aictec.Wejha.tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Aictec.Wejha.pages.Loginpage;
import Aictec.Wejha.pages.homePage;
import dataproviders.LoginconfigFileReader;

/**
 * Unit test for simple App.
 */
public class Logintests {
	public Logintests(WebDriver driver) {
		super();
		this.config = config;
		this.driver = driver;
		this.lp = lp;
	}

	LoginconfigFileReader config=new LoginconfigFileReader();
	WebDriver driver;
	Loginpage lp;

    @Test
    public void login() throws InterruptedException {
    	lp=new Loginpage(driver);    	
	    String username1 = config.getUsername();
		String password1 = config.getPassword();
		lp.getUserName(username1);
		lp.getPassword(password1);
		  //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(5000);
		lp.clickLoginbutton();
	
    }
}
