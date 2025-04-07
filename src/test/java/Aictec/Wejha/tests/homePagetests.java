package Aictec.Wejha.tests;

import org.openqa.selenium.WebDriver;

import Aictec.Wejha.pages.Accountcreationpage;
import Aictec.Wejha.pages.homePage;

public class homePagetests {
	WebDriver driver;
	homePage hp;

	public homePagetests(WebDriver driver) {
		super();
		this.driver = driver;
		this.hp = hp;
	}

	public void newAccountclick() {
		hp=new homePage (driver);
				hp.waittest2(driver);
		//Thread.sleep(15000);
		hp.clickNewaccountbutton();
		}

}
