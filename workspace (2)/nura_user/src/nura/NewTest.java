package nura;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver driver;

	@Test(priority = 1)
	public void beforeClass() {
		
		 System.setProperty("webdriver.gecko.driver","/home/developn51/Downloads/geckodriver");
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://192.168.1.118:3000");
		// driver.manage().window().maximize();

	}
	

	@Test(priority = 2)
	public void UserCreation() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@href='/signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign-in-2-email")).sendKeys("admin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("sign-in-1-password")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-raised btn-lg btn-secondary btn-block']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='material-icons menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@href='/adduser']")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//div[@class='left-sidebar-backdrop fade in']")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.name("name")).sendKeys("Kumar");
				 Thread.sleep(2000);
				 driver.findElement(By.name("email")).sendKeys("Kumar@gmail.com");
				 Thread.sleep(2000);
				 driver.findElement(By.name("phone")).sendKeys("9768685685");
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//select[@class='form-control select_option']")).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//option[@value='6f276244-05ba-46ef-861c-bca74aa86c66']")).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div[2]/p/span/button")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//i[contains(.,'menu')]")).click();
				 Thread.sleep(3000);
	}

@Test(priority = 3)
public void UserGroup() throws InterruptedException
{
	WebDriverWait wait = new WebDriverWait(driver, 20);
	driver.findElement(By.xpath("//i[@class='material-icons menu']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(.,'User group')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='left-sidebar-backdrop fade in']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("harish");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='Select-placeholder']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='Select-placeholder']")).sendKeys(Keys.DOWN);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='Select-placeholder']")).sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@class='btn btn-primary pull-xs-right']")).click();
	 Thread.sleep(5000);
	 
}
//@Test(priority = 4)
//public void Group() throws InterruptedException
//{
//	WebDriverWait wait = new WebDriverWait(driver, 20);
//	driver.findElement(By.xpath("//i[@class='material-icons menu']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//a[@href='/addrole']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[@class='left-sidebar-backdrop fade in']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@name='roleName']")).sendKeys("GreenTT");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary pull-xs-right')]")).click();
//	Thread.sleep(3000);
//	
//	String TextVals= driver.findElement(By.xpath("//div[@class='sweet-alert ']")).getText();
//
//if(TextVals.contains("Duplicate Entry")) {
//	driver.findElement(By.xpath("//button[contains(.,'OK')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='roleName']")).sendKeys("Resource Entry");
// 	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary pull-xs-right')]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary ']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[3]/i[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@class='form-control ']")).clear();
//	Thread.sleep(3500);
//	driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys("Resource Collection");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary pull-xs-right')]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[contains(.,'OK')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(@class,'btn btn-secondary bmd-btn-fab')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@class='btn btn-rounded btn-outline-primary']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//option[contains(.,'Select roles')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//option[contains(.,'Management Test')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[@class='Select-placeholder']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[@class='Select-placeholder']")).sendKeys(Keys.DOWN);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[@class='Select-placeholder']")).sendKeys(Keys.ENTER);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[3]/div/div/span[1]/div/label/div")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@class='btn btn-primary pull-xs-right']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary ']")).click();
//	Thread.sleep(2000);
//}else if(TextVals.contains("Saved Successfully")) {
//	driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary ']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[3]/i[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@class='form-control ']")).clear();
//	Thread.sleep(3500);
//	driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys("Resource set");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary pull-xs-right')]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[contains(.,'OK')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(@class,'btn btn-secondary bmd-btn-fab')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@class='btn btn-rounded btn-outline-primary']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//option[contains(.,'Select roles')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//option[contains(.,'Management Test')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[@class='Select-placeholder']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[@class='Select-placeholder']")).sendKeys(Keys.DOWN);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[@class='Select-placeholder']")).sendKeys(Keys.ENTER);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[3]/div/div/span[1]/div/label/div")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@class='btn btn-primary pull-xs-right']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary ']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//i[@class='material-icons menu']")).click();
//	Thread.sleep(5000);
//}
//}
@Test(priority = 4)
public void Application()throws InterruptedException
{
	WebDriverWait wait = new WebDriverWait(driver, 20);
	driver.findElement(By.xpath("//i[@class='material-icons menu']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@href='/addapplication']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='left-sidebar-backdrop fade in']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("User Management");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[@class='btn btn-primary pull-xs-right']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[contains(.,'OK')]")).click();
    Thread.sleep(5000);
//    driver.findElement(By.xpath("//i[@class='material-icons menu']")).click();
//    Thread.sleep(5000);
}
@Test(priority = 5)
public void Profile()throws InterruptedException
{
	WebDriverWait wait = new WebDriverWait(driver, 20);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//img[@alt='badge']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("html/body/div[1]/div/nav/div[2]/div/a[1]/span")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@class='form-control']")).click();
	Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@name='firstname']")).clear();
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dinesh");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='lastname']")).clear();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[3]/div/input")).sendKeys("98455412233");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='address']")).sendKeys("57 A East rs Puram");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Coimbatore");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TamilNadu");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[contains(@name,'zipcode')]")).sendKeys("643215");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[contains(.,'Update Profile')]")).click();
	 Thread.sleep(3000);
}

@Test(priority = 6)
public void ChangePassword()throws InterruptedException
{
	WebDriverWait wait = new WebDriverWait(driver, 20);
	driver.findElement(By.xpath("//img[@alt='badge']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(.,'Change Password')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='oldPass']")).sendKeys("Test");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='newPass']")).sendKeys("test@1234");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='conPass']")).sendKeys("test@1234");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
    alert.accept();
    driver.findElement(By.xpath("//img[@alt='badge']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(.,'Logout')]")).click();
	Thread.sleep(5000);
	driver.close();
}


}
