package Aictec.Wejha.pages;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import dataproviders.Accountconfigfilereader;
import dataproviders.LoginconfigFileReader;

public class Accountcreationpage {
	 private WebDriver driver;
		Accountconfigfilereader accountconfig=new Accountconfigfilereader();
	   
	   public Accountcreationpage( WebDriver driver ) {
	       this.driver = driver;
	       PageFactory.initElements( driver, this);
	   }
	   
	   @FindBy(how=How.ID,using="company_name")
	   private WebElement companyname;
	   
	   @FindBy(how=How.ID,using="tax_id")
	   private WebElement taxid;
	   
	   @FindBy(how=How.ID,using="phone_number")
	   private WebElement phno;
	   
	   @FindBy(how=How.ID,using="company_email")
	   private WebElement companyemail;
	   
	   @FindBy(how=How.ID,using="address")
	   private WebElement address;
	   
	   @FindBy(how=How.XPATH,using="//input[@id='country']")
	   private WebElement country;
	   
	   @FindBy(how=How.XPATH,using="//*[@aria-activedescendant='country-option-1']")
	   private WebElement selectcountry;
	   
	   @FindBy(how=How.XPATH,using="(//*[@data-testid='ArrowDropDownIcon'])[1]")
	   private WebElement countrydropdown;
	   
	   @FindBy(how=How.XPATH,using="(//*[@data-testid='ArrowDropDownIcon'])[2]")
	   private WebElement statedropdown;
	   
	   @FindBy(how=How.XPATH,using="(//*[@data-testid='ArrowDropDownIcon'])[3]")
	   private WebElement citydropdown;
	   
	   
	   @FindBy(how=How.XPATH,using="//input[@id='state']")
	   private WebElement state;
	   
	   @FindBy(how=How.XPATH,using="//input[@id='city']")
	   private WebElement city;
	   
	   @FindBy(how=How.ID,using="pincode")
	   private WebElement pincode;
	   
	   @FindBy(how=How.ID,using="user_full_name")
	   private WebElement userfullname;
	   
	   @FindBy(how=How.ID,using="user_name")
	   private WebElement username;
	   
	   @FindBy(how=How.ID,using="user_email")
	   private WebElement usermail;
	   
	   @FindBy(how=How.ID,using="password")
	   private WebElement password;
	   
	   @FindBy(how=How.CLASS_NAME,using="success-button")
		private WebElement create;
	   
	@FindBy(how=How.XPATH,using="//*[@class='MuiAlert-message muiltr-1xsto0d']")
			private WebElement errorpopup;
	   
	   public void getCompanyname() {
			String companyname1= accountconfig.getAccountconfigvalue("companyname");
			companyname.sendKeys(companyname1);
	   }
			
	   public void getTaxid() {
			String taxid1= accountconfig.getAccountconfigvalue("taxid");
				taxid.sendKeys(taxid1);
	   }
	   
	   public void getPhonenumber() {
			String phno1= accountconfig.getAccountconfigvalue("phno");
		   phno.sendKeys(phno1);
	   }
	   
	   public void getCompanymail(){
			String companymail1= accountconfig.getAccountconfigvalue("companymail");
		   companyemail.sendKeys(companymail1);
       }
	   
	   public void getaddress() {
			String address1= accountconfig.getAccountconfigvalue("address");
            address.sendKeys(address1);
       }
	   
	   public void selectCountry() throws InterruptedException {
			String country1= accountconfig.getAccountconfigvalue("country");
			Thread.sleep(5000);
			//country.click();
			//countrydropdown.click();
			Actions actions = new Actions(driver);
	        actions.moveToElement(country).sendKeys(country1)
	               .moveToElement(countrydropdown) // Move to the submenu after hovering the menu
	               .click()
	               .perform();
	       
	        Thread.sleep(5000);
			country.sendKeys(country1);
			country.sendKeys(Keys.ARROW_DOWN);
			
			country.sendKeys(Keys.ENTER);
			country.sendKeys(Keys.TAB);
	    }
	   
	   public void selectState() {
			String state1= accountconfig.getAccountconfigvalue("state");
			Actions actions = new Actions(driver);
	        actions.moveToElement(state).sendKeys(state1)
	               .moveToElement(statedropdown) // Move to the submenu after hovering the menu
	               .click()
	               .perform();
	        state.sendKeys(state1);
			state.sendKeys(Keys.ARROW_DOWN);
			
			state.sendKeys(Keys.ENTER);
			state.sendKeys(Keys.TAB);
	    }
	   
	   public void selectCity() {
			String city1= accountconfig.getAccountconfigvalue("city");
			Actions actions = new Actions(driver);
	        actions.moveToElement(city).sendKeys(city1)
	               .moveToElement(citydropdown) // Move to the submenu after hovering the menu
	               .click()
	               .perform();
	        city.sendKeys(city1);
			city.sendKeys(Keys.ARROW_DOWN);
			
			city.sendKeys(Keys.ENTER);
			city.sendKeys(Keys.TAB);
	        
	    }
	   
	   public void getPincode() {
			String pincode1= accountconfig.getAccountconfigvalue("pincode");
		   pincode.sendKeys(pincode1);
       }
	   
	   public void getUserFullname() {
			String userfullname1= accountconfig.getAccountconfigvalue("userfullname");
		   userfullname.sendKeys(userfullname1);
       }
	   
	   public void getusername() {
			String username1= accountconfig.getAccountconfigvalue("username");
			username.sendKeys(username1);
       }
	   
	   public void getUsermail() {
			String usermail1= accountconfig.getAccountconfigvalue("usermail");
		   usermail.sendKeys(usermail1);
       }
	   
	   public void getPassword() {
			String password1= accountconfig.getAccountconfigvalue("password");
            password.sendKeys(password1);
       }
	   
	   public void clickcreatebutton() {
			create.click();
		}
	   
	   
    
	   public void iferrorexiststakescreenshot(WebDriver driver) throws IOException {
		   try {
			  boolean error = errorpopup.isDisplayed();
			  
			  File oldscreenshot = new File("screenshot.png");
			  
			  if (oldscreenshot.exists())
			  {
				  oldscreenshot.delete();
			  }
			  
	            // If the element is present, take a screenshot
	            if (error = true) {
	            	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	                // Save the screenshot to a desired location using Java IO
	                File destination = new File("screenshot.png");
	                destination.delete();
	                Files.copy(screenshot.toPath(), destination.toPath()); // Using Java NIO to copy the file
	            }
	        } catch (NoSuchElementException e) {
	            System.out.println("Element not found, no screenshot taken.");
	        }
	   }

}
