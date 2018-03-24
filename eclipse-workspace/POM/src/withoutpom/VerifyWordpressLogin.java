package withoutpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 

//*
//*/
public class VerifyWordpressLogin 
{
 
 
@Test
public void verifyValidLogin()
{
 
WebDriver driver=new FirefoxDriver();
System.setProperty("Webdriver.geckodriver","home/dinesh/Downloads/geckodriver");

driver.get("http://demosite.center/wordpress/wp-login.php");
driver.manage().window().maximize();
 
LoginPage login=new LoginPage(driver);
 
 
 
login.clickOnLoginButton();
 
 
driver.quit();
 
}
 
 
}