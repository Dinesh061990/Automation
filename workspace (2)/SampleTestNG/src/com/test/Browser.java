package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	static String driverPath = "/home/developn51/workspace/SampleTestNG/lib";
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser (String browserType) {
		switch (browserType) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "/home/developn51/Downloads/geckodriver");
			return	driver = new FirefoxDriver();
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			return	driver = new ChromeDriver();
		case "IE":
			System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			return	driver = new InternetExplorerDriver();
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			
			return driver = new FirefoxDriver();
		}
	}
}