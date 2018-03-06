package data;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException ;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Data {
	static WebDriver t;

	@Test(dataProvider = "dp", priority = 1)

	public void Test(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j,
			String k, String l) throws InterruptedException {
		t.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[2]/u")).click();
		Thread.sleep(1000);
		t.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		Thread.sleep(1000);
		t.findElement(By.name("firstname")).sendKeys(a);
		Thread.sleep(1000);
		t.findElement(By.name("lastname")).sendKeys(b);
		Thread.sleep(1000);
		t.findElement(By.name("dob")).sendKeys(c);
		Thread.sleep(1000);
		t.findElement(By.name("email_address")).sendKeys(d);
		Thread.sleep(1000);
		t.findElement(By.name("street_address")).sendKeys(e);
		Thread.sleep(1000);
		t.findElement(By.name("postcode")).sendKeys(f);
		Thread.sleep(1000);
		t.findElement(By.name("city")).sendKeys(g);
		Thread.sleep(1000);
		t.findElement(By.name("state")).sendKeys(h);
		Thread.sleep(1000);
		Select ds = new Select(t.findElement(By.name("country")));
		ds.selectByIndex(99);
		Thread.sleep(1000);
		t.findElement(By.name("telephone")).sendKeys(j);
		Thread.sleep(1000);
		t.findElement(By.name("password")).sendKeys(k);
		Thread.sleep(1000);
		t.findElement(By.name("confirmation")).sendKeys(l);
		Thread.sleep(1000);
		t.findElement(By.id("tdb4")).click();
		Thread.sleep(1000);
		//Alert alert = t.switchTo().alert();
		// String alertMessage= t.switchTo().alert().getText();
		//String alertMessage = alert.getText();
//		System.out.println(alertMessage);
		// Thread.sleep(1000);
		//alert.accept();
		WebDriverWait Wait = new WebDriverWait(t, 20);
		 
		Wait<WebDriver> wait = new FluentWait<WebDriver>(t)
							//Wait for the condition
						       .withTimeout(30, TimeUnit.SECONDS) 
						         // which to check for the condition with interval of 5 seconds. 
						       .pollingEvery(5, TimeUnit.SECONDS) 
						     //Which will ignore the NoSuchElementException
						       .ignoring(NoSuchElementException.class);

		
	try
	{
	
		String AlertMessage = t.findElement(By.xpath(".//*[@id='bodyContent']/table/tbody/tr/td")).getText();
		String Alert = "Email Already Exist";
		Assert.assertEquals(AlertMessage,Alert);
			System.out.println("Email Exists");
	{
			System.out.println("Email not exist");
		}
	}catch (NoSuchElementException aa) {
		String ConformationMessage = t.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
		String Conform = "Your Account Has Been Created!";
		
		if(ConformationMessage.equals(Conform))
		{
		System.out.println("Account Created ");
	}else
	{
		System.out.println("Account Not created");
	}
	}
	}
	// @Test(dataProvider = "ap",priority=2)
	// public void Test1(String m, String n) {
	// t.findElement(By.linkText("login")).click();
	// t.findElement(By.name("email_address")).sendKeys(m);
	// t.findElement(By.name("password")).sendKeys(n);
	// t.findElement(By.id("tdb5")).click();
	//
	// }

	@BeforeMethod
	public void beforeMethod() {

		t = new FirefoxDriver();
		System.setProperty("webdriver.FirefoxDriver","/home/developn51/Downloads/geckodriver");
		t.manage().window().maximize();
		t.get("http://gcrit.com/build3/");
		t.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod

	public void afterMethod() {
		t.close();
	}

	@DataProvider
	  public Object[][] dp() {
		
	    return new Object[][] {
	     // new Object[] {"","Kumar" ,"05/21/1990", "dk@gmail.com", "Gandhi park","985455","Cbe","TN","","54522","dk@123","dk@123"},
	 //   new Object[] {"Dinesh","" ,"05/21/1990", "dk@gmail.com", "Gandhi park","985455","Cbe","TN","","54522","dk@123","dk@123"},
	   // new Object[] {"Dinesh","kumar" ,"", "dk@gmail.com", "Gandhi park","985455","Cbe","TN","54522","","dk@123","dk@123"},
	  //  new Object[] {"Dinesh","kumar" ,"05/21/1990", "", "Gandhi park","985455","Cbe","TN","54522","",",dk@123","dk@123"},
            new Object[] {"Dinesh","kumar" ,"05/21/1990", "pp@gmail.com", "Gandhi park","985455","Cbe","TN","","54522","dk@123","dk@123"},
	        new Object[] {"Dinesh","kumar" ,"05/21/1990", "RTREeDD668@gmail.com", "Gandhi park","985455","Cbe","TN","","54522","dk@123","dk@123"},
	    
		};
	}
	// @DataProvider
	// public Object[][] ap() {
	// return new Object[][] {
	// new Object[] {"shoba" ,"9159895996"},
	// new Object[] { "dk11@gmail.com", "dk@123", },
	//
	//
	// };
	// }
}
