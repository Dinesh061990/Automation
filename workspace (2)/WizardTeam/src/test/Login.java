package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class Login{
	public static WebDriver driver;
	static String un = "nanda051288@gmail.com";
	static String pwd = "nanda@123";
	static String baseurl = "http://192.168.1.240/userLogin";
	
	@BeforeClass
	public static void LoginTest() throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver","/home/developn51/Downloads/geckodriver");
     driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         driver.get(baseurl);
		driver.findElement(By.xpath("//a[contains(.,'Login')]")).click();
		Thread.sleep(3000);
		 WebElement cssValue= driver.findElement(By.xpath("//input[@id='sign-in-2-email']"));
         JavascriptExecutor jse = (JavascriptExecutor) driver;
         jse.executeScript("document.getElementById('s').value='nanda051288@gmail.com'");
//		driver.findElement(By.xpath("//input[@id='sign-in-2-email']")).sendKeys(un);
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='sign-in-1-password']")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		}
	@AfterClass
	public static void shutDownSelenium() {
	    driver.quit();
}
}

