package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NursingPage {

	static WebDriver lDriver;
	public NursingPage(WebDriver driver) {
		this.lDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebElement nursing() {
		WebElement nursing_element= lDriver.findElement(By.linkText("Nursing"));
		return nursing_element;
	}
	//h1[normalize-space()='NURSING DEPARTMENT OF SAKRA']
	
}
