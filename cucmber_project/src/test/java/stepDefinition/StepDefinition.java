package stepDefinition;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObjectPackage.Centres_and_Specialities;
import pageObjectPackage.HomePage;
import pageObjectPackage.InternationalPatients;
import pageObjectPackage.NursingPage;
import pageObjectPackage.PatientCare;
import utility.BaseClass;
import utility.BrowserManager;
import java.nio.file.Files;



public class StepDefinition extends BrowserManager  {
	public WebDriver driver;
	public HomePage homePage;
	public Centres_and_Specialities centres_and_Specialities;
	public PatientCare patientCare;
	public InternationalPatients international_Patients;
	public NursingPage nursingPage;
	
	
	
	
	/*
	 * @Given("Open Firefox") public void open_firefox() {
	 * BrowserManager.setDriver("Chrome"); driver = BrowserManager.getDriver();
	 * loginPage = new Login(driver); homePage = new HomePage(driver); }
	 */

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() throws IOException {
		//System.setProperty("webdriver.chrome.driver","D:\\java\\selenium-web-driver\\chrome-driver\\chromedriver_win32\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-extensions");
		//options.addArguments("--start-maximized");
		//driver = new ChromeDriver(options);
		BrowserManager.setDriver("Chrome");
		driver = BrowserManager.getDriver();
		homePage = new   HomePage(driver);
		// centres_and_Specialities = new Centres_and_Specialities(driver);
		//initializebrowser("chrome");
	
	}

	
	@When("the User opens {string}")
	public void the_user_opens(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(url);
		
	}

	@When("User Click On Dr. Shishir Chandrashekhar")
	public void user_click_on_dr_shishir_chandrashekhar() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(5000);
		homePage.click_on_dr_name();
	}

	@When("User click on the Consultation button")
	public void user_click_on_the_consultation_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		homePage.click_on_consult_btn();
	}

	@When("Request an Appointments page is displayed")
	public void request_an_appointments_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("test");
	}

	//@When("^Enter Username (.*) and password (.*)$")
	@When("^User enters the name(.*)$")
	public void user_enters_the_name(String name) {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.enter_client_name(name);
	}

	@When("^User enters the Email(.*)$")
	public void user_enters_the_email(String email) {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.enter_email_id(email);
	}

	@When("^User enters Mobile Number(.*)$")
	public void user_enters_mobile_number(String num) {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.enter_mob_number(num);
	}

	@When("User selects gender from the Gender dropdown")
	public void user_selects_gender_from_the_gender_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("test");
	}

	@When("User selects the Date of Birth")
	public void user_selects_the_date_of_birth() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("test");
	}

	@When("User selects Preferred Date1")
	public void user_selects_preferred_date1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("test");
	}

	@When("User selects Preferred Date2")
	public void user_selects_preferred_date2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("test");
	}

	@When("User selects the I am not a robot checkbox")
	public void user_selects_the_i_am_not_a_robot_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("test");
	}

	@Then("User clicks on the Submit button")
	public void user_clicks_on_the_submit_button() {
	    // Write code here that turns the phrase above into concrete actions

			homePage.close_btn_click();
			
		
	}
	
	@Given ("User clicks on Centres and Specialites page")
	public void Centres_and_Specialites_page(){
		driver = BrowserManager.getDriver();
		 centres_and_Specialities = new Centres_and_Specialities(driver);
		
		centres_and_Specialities.click_on_Centres_and_Specialities();
		//driver.close();
		
	}
	
	@Then("Page with heading Centres & Specialities {string} will display")
	public void Centres_and_Specialites_page_verify(String heading) {
		Assert.assertEquals(heading, centres_and_Specialities.centres_and_specialities_page_heading().getText());
	}
	
	@Given ("User clicks on Patient care")
	public void patient_care_page() {
		driver= BrowserManager.getDriver();
		patientCare = new PatientCare(driver);
		PatientCare.patient_care().click();
		PatientCare.patient_info().click();
	}
	
	@Then ("Patient Info {string} heading will diaplay")
	public void patient_info_verify(String title) {
		Assert.assertEquals(title, PatientCare.page_title());
	}
	
	@Given ("User clicks on International patients")
	public void international_patients_page() {
		driver = BrowserManager.getDriver();
		international_Patients = new InternationalPatients(driver);
		international_Patients.international_patient().click();
		
	}
	
	@Then ("International Patient Services {string} heading will diaplay")
	public void international_patient_page_verify(String title) {
		Assert.assertEquals(title, international_Patients.international_page_title());
	}
	
	

	@Given ("User clicks on Nursing")
	public void nursing_page() {
		driver = BrowserManager.getDriver();
		nursingPage= new NursingPage(driver);
		nursingPage.nursing().click();
		Assert.assertTrue(false);
			
	}
	
	@After
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	      // Take a screenshot...
	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	     // scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
	     // scenario.attach(screenshot,null, null);
	      scenario.attach(screenshot, "cucmber_project\target", "failes test");

	    }
	}
}
