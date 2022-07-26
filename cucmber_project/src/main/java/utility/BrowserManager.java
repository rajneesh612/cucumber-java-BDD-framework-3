package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserManager {
	public static ChromeDriver chromeDriver;
	public static EdgeDriver edgeDriver;
	public static FirefoxDriver firefoxDriver;
	
	public static enum EPConditions {
		VISIBLE, CLICKABLE, PRESENCE, STALENESS
	}
	
	static WebDriverWait wait;

	private static WebDriver webDriver;
	//private static WebDriverWait wait;

	public static void setDriver(String browser) {

		System.out.println("setDriver " + browser);

		if(webDriver == null) {
			if (browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver","D:\\java\\selenium-web-driver\\chrome-driver\\chromedriver_win32\\chromedriver.exe");
				ChromeOptions c = new ChromeOptions();
				c.addArguments("--start-maximized");
				c.addArguments("--disable-extension");
				c.addArguments("disable-media-stream");
				//c.addArguments("headless");
				
				webDriver = new ChromeDriver(c);
				
			} else if (browser.equals("Firefox")) {
				ProfilesIni ini = new ProfilesIni();
				FirefoxProfile profile = ini.getProfile("Testing");
				FirefoxOptions op = new FirefoxOptions();
				op.setProfile(profile);
				
				webDriver = new FirefoxDriver(op);
			} else if (browser.equals("Edge")) {
				webDriver = new EdgeDriver();
			}
		}
		

	}

	public static void navigateTo(String url) {
		webDriver.get(url);
	}

	public static void close() {
		webDriver.close();
	}
	
	public static WebDriver getDriver() {
		if(webDriver != null) {
			return webDriver;
		}
		return null;
	}
	

	
}

