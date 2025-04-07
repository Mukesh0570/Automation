package Aictec.Wejha.pages;

import static org.testng.Assert.assertTrue;

import java.io.ObjectInputFilter.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dataproviders.LoginconfigFileReader;

public class Loginpage {
	   private WebDriver driver;
	   LoginconfigFileReader config = new LoginconfigFileReader();
	   
	   public Loginpage( WebDriver driver ) {
	       // Assign the WebDriver instance to the 'driver' variable.
	       this.driver = driver;
	       // Initialize the WebElements using the PageFactory.
	       PageFactory.initElements( driver, this);
	   }
	   
	
	@FindBy(how=How.ID,using="email")
	private WebElement username;
	
	@FindBy(how=How.ID,using="password")
	private WebElement password;
	
	@FindBy(how=How.CLASS_NAME,using="success-button")
	private WebElement Login;
	
	public void getUserName(String username1) {
		username.sendKeys(username1);
	}

	public void getPassword(String password1) {
		password.sendKeys(password1);
	}	
	
	public void clickLoginbutton() {
		Login.click();
	}
	

		
	}
	
	
