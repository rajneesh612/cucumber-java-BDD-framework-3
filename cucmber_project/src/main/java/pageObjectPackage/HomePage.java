package pageObjectPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class HomePage {

	WebDriver lDriver;
	public HomePage(WebDriver driver) {
		this.lDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="(//a[@class='transition-fast'and text()='Dr. Shishir Chandrashekhar'])[1]" )
	@CacheLookup
	WebElement dr_name_Element;
	
	
	@FindBy(xpath ="(//button[@type='button'][normalize-space()='Consultation'])[1]" )
	@CacheLookup
	WebElement consult_btn_Element;
	
	//input[@id='req_name']  req_email req_mobile
	
	@FindBy(xpath ="//input[@id='req_name']" )
	@CacheLookup
	WebElement name_txt_fld;
	
	@FindBy(xpath ="//input[@id='req_email']" )
	@CacheLookup
	WebElement email_txt_fld;

	@FindBy(xpath ="//input[@id='req_mobile']" )
	@CacheLookup
	WebElement mob_number_fld;
	
	//div[@id='request-appointment']//div[@class='bg_modal_close close close-display']
	@FindBy(xpath = "//div[@id='request-appointment']//div[@class='bg_modal_close close close-display']")
	@CacheLookup
	WebElement close_btn_Element;
	
	
public void click_on_dr_name() {
	
	new WebDriverWait(lDriver, Duration.ofMillis(2000)).until(ExpectedConditions.elementToBeClickable(dr_name_Element));
	dr_name_Element.click();
	}

	
	  public void click_on_consult_btn() {
	  
	 new WebDriverWait(lDriver,
	  Duration.ofMillis(2000)).until(ExpectedConditions.elementToBeClickable(consult_btn_Element));
	  consult_btn_Element.click();
	  }
	 
	  public void enter_client_name(String name) {
		  new WebDriverWait(lDriver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOf(name_txt_fld));
		  name_txt_fld.clear();
		  name_txt_fld.sendKeys(name);
	  }
	  
	  public void enter_email_id(String email) {
		  new WebDriverWait(lDriver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOf(email_txt_fld));
		  email_txt_fld.clear();
		  email_txt_fld.sendKeys(email);
	  }

	  public void enter_mob_number(String number) {
		  new WebDriverWait(lDriver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOf(mob_number_fld));
		  mob_number_fld.clear();
		  mob_number_fld.sendKeys(number);
	  }
	  
	  public void close_btn_click() {
		  new WebDriverWait(lDriver, Duration.ofMillis(4000)).until(ExpectedConditions.visibilityOf(close_btn_Element));
		  close_btn_Element.click();
	  }

}
