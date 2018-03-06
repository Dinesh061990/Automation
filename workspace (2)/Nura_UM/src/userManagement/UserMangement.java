package userManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UserMangement {

	WebDriver driver;

	@Test(priority = 1)
	public void beforeClass() {
//		System.setProperty("webdriver.chrome.driver", "/home/developn49/Downloads/chromedriver");
//		driver = new ChromeDriver();
		 System.setProperty("webdriver.Firefoxdriver", "/home/developn51/Downloads/geckodriver");
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://192.168.1.118:3000");
		// driver.manage().window().maximize();

	}
	// @Test(priority =2)
	// public void signUp() {
	// driver.findElement(By.name("name")).sendKeys("Sathya");
	// driver.findElement(By.name("email")).sendKeys("sathya11195@gmail.com");
	//
	// driver.findElement(By.name("phone")).sendKeys("9751019052");
	// driver.findElement(By.name("company")).sendKeys("ThinkTower");
	//
	// }

	@Test(priority = 2)
	public void login() throws InterruptedException {
		// try
		// {
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		//
		//
		// }
		// catch(UnhandledAlertException e) {
		// Alert alert=driver.switchTo().alert();
		//// System.out.println(alert.getText());
		// alert.accept();
		driver.findElement(By.xpath("//a[@href='/signin']")).click();
		
		
		driver.findElement(By.id("sign-in-2-email")).sendKeys("admin@gmail.com");
	
		driver.findElement(By.id("sign-in-1-password")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//button[@class='btn btn-raised btn-lg btn-secondary btn-block']")).click();

//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		driver.findElement(By.xpath("//i[contains(@class,'material-icons menu')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/adduser']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='jumbotron jumbotron-fluid']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Priya");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("riyaaece@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("7845129676");
		Thread.sleep(2000);
//		Select drpCountry = new Select(driver.findElement(By.name("role")));
//		drpCountry.selectByVisibleText("Lead");
//		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-secondary bmd-btn-fab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[1]/td[6]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nanda");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@maxlength='10']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("9500232629");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("7/357");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'street')]")).sendKeys("ketti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'city')]")).sendKeys("ooty");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'state')]")).sendKeys("Tamilnadu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'country')]")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'zipcode')]")).sendKeys("643215");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//i[contains(@class,'material-icons menu')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'/usergroup')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='left-sidebar-backdrop fade in']")).click();
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("TestGroup");
		Thread.sleep(2000);
		Select selectusers = new Select(driver.findElement(By.name("username")));
		selectusers.selectByVisibleText("Chitra");
		driver.findElement(By.xpath("//button[@class='btn btn-primary pull-xs-right']")).click();
		
//			driver.findElement(By.xpath("//img[@alt='badge']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".material-icons.menu")));
//		ele.click();
//		driver.findElement(By.cssSelector(".material-icons.menu")).click();
	}
	// WebDriverWait wait = new WebDriverWait(driver, 60);
	// WebElement ele =
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='container']/div/nav/div/div/a\"")));
	// ele.click();
	// driver.findElement(By.xpath("//a[@href='/signin']")).click();
	// driver.findElement(By.id("sign-in-2-email")).sendKeys("admin@gmail.com");
	// driver.findElement(By.id("sign-in-1-password")).sendKeys("admin@123");
	// driver.findElement(By.xpath(".//*[@id='container']/div/div/div/div/form/button")).click();

//	@Test(priority = 2)
//	public void addUser() {
////		WebDriverWait wait = new WebDriverWait(driver, 20);
////		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(@class,'material-icons menu')]")));
////		ele.click();
//		
//		 driver.findElement(By.xpath(".//*[@id='navigation']/li/button")).click();
//	}

// public static void main(String[] args) {
// UserMangement UM = new UserMangement();
// UM.beforeClass();
// UM.signUp();
// public void signUp() {
// System.out.println("signUp");
// }
//
//@Test(priority = 3)
// public void closeBrowser() {
// driver.quit();
 }
