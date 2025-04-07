package Aictec.Wejha.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataproviders.LoginconfigFileReader;

public class homePage {
	 private WebDriver driver;
	   LoginconfigFileReader config = new LoginconfigFileReader();
	   
	   public homePage( WebDriver driver ) {
	       this.driver = driver;
	       PageFactory.initElements( driver, this);
	   }
	   @FindBy(how=How.XPATH,using="(//label[@for='Account Management']/following::ul/li)[1]")
		private WebElement cmscloud;
	   
	   @FindBy(how=How.XPATH,using="//*[@class='top-button']")
		private WebElement newaccount;
	   
	   
	   public void waittest2(WebDriver driver) {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        // Wait for a specific element (e.g., a footer or a specific div) to become visible
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("top-button")));
	   }
	   public void clickNewaccountbutton() {
			newaccount.click();	
	   }

}
