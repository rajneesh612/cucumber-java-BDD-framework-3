package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseClass {
	//public static org.apache.log4j.Logger demoLogger =LogManager.getLogger(BaseClass.class.getName());
	protected static WebDriver webdriver;
	protected Properties config;
	protected String configFilename = "config";
	
	public String  browser_name;
	public String url;
	
	
	
	
	
	
	public WebDriver initializebrowser(String brwsr_name) throws IOException{
		   browser_name = brwsr_name;
		
		if(browser_name.equalsIgnoreCase("Mozilla")) {
			//if(browser_name.equals("Mozilla")) {	
			System.setProperty("webdriver.gecko.driver","D:\\java\\selenium-web-driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			webdriver = new FirefoxDriver();
			webdriver.manage().window().maximize();
		}
		else if(browser_name.equalsIgnoreCase("chrome")) {
			//else if(browser_name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\java\\selenium-web-driver\\chrome-driver\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("--start-maximized");
			webdriver = new ChromeDriver(options);
		}
		else if(browser_name.equalsIgnoreCase("edge")) {
			//else if(browser_name.equals("edge")) {
			System.setProperty("webdriver.edge.driver","D:\\java\\selenium-web-driver\\edge-driver\\edgedriver_win64\\msedgedriver.exe");
			webdriver=new EdgeDriver();
			webdriver.manage().window().maximize();
		}
		return webdriver;
		
}
	}