package project;



//import java.io.File;
//import java.io.IOException;
//import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class NewTest {
	WebDriver driver;

	@BeforeTest
	public void bt() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/developn50/Downloads/chromedriver");
		driver.get("http:/amazon.com/");
		driver.manage().getCookies();
	}

	@Test
	public void f() throws InterruptedException {
		
	driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Bottle");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Go']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='s-ref-checkbox-Blender Bottle']")).click();
	Thread.sleep(3000);
	Select sort = new Select(driver.findElement(By.id("sort")));
	sort.selectByVisibleText("Price: High to Low");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//h2[@data-attribute='2 Pack Blender Bottle Radian 32 oz. Tritan Shaker Bottle with Loop Top ( Deep Sea Green)']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@aria-labelledby='wishListMainButton-announce']")).click();
	}
	@Test(dataProvider = "dp")
	
	public void s (String a , String b) throws InterruptedException {
	
	if((a!="" && b!="")){
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(a);
          
		try {
			driver.findElement(By.xpath(".//*[@id='continue']")).click();
			driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys(b);
			driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();

		} catch (NoSuchElementException aa) {
			
			driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys(b);
			driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		}
		try {
			String ErrorMsg = driver.findElement(By.xpath(".//*[@id='auth-error-message-box']/div/h4")).getText();
			System.out.println(ErrorMsg);
			if (ErrorMsg.contains("There was a problem")) {
				driver.findElement(By.linkText("Forgot your password?")).click();
				String Persistance = driver
						.findElement(By.xpath(".//*[@id='a-page']/div[1]/div[3]/div/div[1]/div/form/h1")).getText();
				if (Persistance.contains("Password assistance")) {
					driver.findElement(By.xpath(".//*[@id='continue']")).click();
				}
				driver.findElement(By.cssSelector("input[value='skip']")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[value='notSkip']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(".//*[@id='continue']")).click();
				driver.findElement(By.xpath(".//*[@id='cvf-page-content']/div/div/div[1]/form/div[2]/input"))
						.sendKeys(Keys.ENTER);
				Thread.sleep(80000);
				driver.findElement(By.xpath(".//*[@id='a-autoid-0']/span/input")).click();
				driver.findElement(By.xpath(".//*[@id='ap_fpp_password']")).sendKeys("Dinesh@1234");
				driver.findElement(By.xpath(".//*[@id='ap_fpp_password_check']")).sendKeys("Dinesh@1234");
				driver.findElement(By.xpath(".//*[@id='continue']")).click();
			}

		} catch (NoSuchElementException y) {
//			driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Bottle");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@value='Go']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@name='s-ref-checkbox-Blender Bottle']")).click();
//			Thread.sleep(3000);
//			Select sort = new Select(driver.findElement(By.id("sort")));
//			sort.selectByVisibleText("Price: High to Low");
//		    Thread.sleep(3000);
//		    driver.findElement(By.xpath("//h2[@data-attribute='2 Pack Blender Bottle Radian 32 oz. Tritan Shaker Bottle with Loop Top ( Deep Sea Green)']")).click();
//		    Thread.sleep(3000);
//		    driver.findElement(By.xpath("//input[@aria-labelledby='wishListMainButton-announce']")).click();
		    
		    driver.findElement(By.xpath("//a[contains(.,'See all buying options')]")).click();			
			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			driver.findElement(By.xpath("//span[contains(.,'Not Nandha? Sign Out')]")).click();
	}
	}else {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Shahul");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("shahul@thinktower.in");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Shahul@1234");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Shahul@1234");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
	}
	
	}
//	@AfterMethod
//
//	public void afterMethod() {
//		driver.close();
//	}
	  @DataProvider
	    public Object[][] dp() {
	      return new Object[][] {
	        new Object[] {"dinesh.k@thinktower.in","Dinesh@123"},
	      
	  
	};
	  }
}

	
	