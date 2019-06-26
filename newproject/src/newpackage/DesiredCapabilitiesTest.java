package newpackage;

//import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import java.lang.Object;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //C:\Program Files\Mozilla Firefox
 
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("moz:firefoxOptions", options);
		//set more capabilities as per your requirements
 
		System.setProperty("webdriver.gecko.driver", "C:\\testing\\sel\\driver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://www.google.com");

	}

}
