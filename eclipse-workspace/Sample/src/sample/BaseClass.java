package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;

public class BaseClass {
	
	static WebDriver driver;

	@BeforeTest
	public void setupApplication(String browser) {

		Reporter.log("=====Browser Session Started=====", true);
		System.out.println(browser);
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/dinesh/Downloads/geckodriver");
			  driver = new FirefoxDriver();
			  Reporter.log("=====Application Started=====", true);
		// If browser is IE, then do this	  

		}else if (browser.equalsIgnoreCase("chrome")) { 

			  // Here I am setting up the path for my chromedriver

//			  System.setProperty("webdriver.chromedriver1", "/home/dinesh/Downloads/chromedriver1");

			  driver = new ChromeDriver();
			  Reporter.log("=====Application Started=====", true);

		} 
		driver.get("https://www.gmail.com");
	}
	
	@AfterTest

	public void closeApplication() {
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
	}
}
