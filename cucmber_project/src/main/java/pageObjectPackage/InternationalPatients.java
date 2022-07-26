package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class InternationalPatients {

	static WebDriver lDriver;
	public InternationalPatients(WebDriver driver) {
		this.lDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebElement international_patient() {
		WebElement international_patient_element= lDriver.findElement(By.xpath("//a[@title='International Patients - Best International Healthcare in India']"));
		return international_patient_element;
	}
	
	public static String international_page_title () {
		
		WebElement title_Element = lDriver.findElement(By.xpath("//h1[normalize-space()='International Patient Services']"));
		String international_page_title = title_Element.getText();
		return international_page_title;
	}

}
