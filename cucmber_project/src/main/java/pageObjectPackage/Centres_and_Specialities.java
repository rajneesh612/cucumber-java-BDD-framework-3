package pageObjectPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class Centres_and_Specialities extends HomePage {

	
	public Centres_and_Specialities(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//WebDriver lDriver;
	/*
	 * public Centres_and_Specialities(WebDriver driver) { this.lDriver = driver;
	 * PageFactory.initElements(driver, this); }
	 */
	

	@FindBy(xpath ="//a[@title='Centres & Specialities of Sakra World Hospital - Multi Speciality Hospital in Bangalore']" )
	@CacheLookup
	WebElement centres_and_specialities;
	
	//h1[@xpath=1]
	
	@FindBy(xpath ="//h1[normalize-space()='Centres & Specialities']" )
	@CacheLookup
	WebElement centres_and_specialities_page_heading;
	
	
	public void click_on_Centres_and_Specialities () {
		centres_and_specialities.click();
	}
	
	public WebElement centres_and_specialities_page_heading() {
		
		 new WebDriverWait(lDriver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOf(centres_and_specialities_page_heading));
		return centres_and_specialities_page_heading;
	
	}
	
	
	
}
