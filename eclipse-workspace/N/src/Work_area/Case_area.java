package Work_area;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Case_area extends ww {
	//public WebDriver dr;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.out.println("started successfully");
	  System.getProperty("webdriver.chrome.driver", "/home/nanda/Downloads/chromedriver");
	  dr= new ChromeDriver();
	  dr.get(Ct_dec.site);
	  login();
	  System.out.println("logged in function completed successfully");
	  validlogin();
	  cmp();
	  
	  Thread.sleep(2000);
	  dr.quit();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }
//alphacity123@gmail.com / alphacity@123
}
