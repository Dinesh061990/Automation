package pom;

import java.util.concurrent.TimeUnit;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;


public class FunctionalTest
{ 
	protected static WebDriver driver; 
	@BeforeClass 
	public static void setUp()
	{ 
		driver = new FirefoxDriver(); 
		System.setProperty("webdriver.geckodriver","/home/dinesh/downloads/geckodriver");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
    } 
//	@AfterTest
//	public void cleanUp()
//	{ 
//		driver.manage().deleteAllCookies(); 
//    } 
	
//	@AfterClass 
//	public static void tearDown()
//	{
//		driver.close(); 
//	} 
}
