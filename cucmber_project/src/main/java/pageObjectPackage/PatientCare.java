package pageObjectPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientCare {
	static WebDriver lDriver;
	public PatientCare(WebDriver driver) {
		this.lDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
public static WebElement patient_care() {
		
		WebElement patient_care_btnElement = lDriver.findElement(By.xpath("//a[@title='Patient care - Best Treatment at Sakra World Hospital, Bellandur']"));
		
		return patient_care_btnElement;
	}


public static WebElement patient_info()
{
	WebElement patient_info_Element = lDriver.findElement(By.xpath("//a[@title='Patient info Page of Sakra - Healthcare in Bangalore']"));
	
	return patient_info_Element;
}


public static String page_title() {
	WebElement title_element = lDriver.findElement(By.xpath("//h1[@class='new-abt']"));
	String page_title = title_element.getText();
	
	return page_title;
}

}
