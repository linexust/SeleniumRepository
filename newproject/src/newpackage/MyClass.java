package newpackage;

import org.openqa.selenium.*;
import java.lang.Thread;
import org.openqa.selenium.firefox.*;
import java.lang.System;

public class MyClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String url = "https://www.google.co.in";
		//System.setProperty("webdriver.gecko.driver", "C:\testing\sel\driver");
		System.setProperty("webdriver.gecko.driver", "C:\\testing\\sel\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.co.in");
		driver.navigate().to(url);
		
		Thread.sleep(3000);
		driver.close();
	}

}
