package sample;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
//import org.testng.Reporter;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.Test;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseClass {

	//data provider definition
	@DataProvider(name = "dp")
	public Object[][] createData1() {
	 return new Object[][]{
	   { "firefox","chrome"},
	   { "chrome","firefox"}
	 };
	}

	
	@Test(dataProvider="dp") 
	public void valid(String browser) throws InterruptedException {
		setupApplication(browser);
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("dk061990");
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/content/span")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dinesh@43234");
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/content/span")).click();
    Thread.sleep(3000);
    System.out.println("Sign-In Successfull");
    Thread.sleep(3000);
	}	
	
	@Test(dataProvider="dp")
	public void invalid(String browser) throws InterruptedException {
	    setupApplication(browser);
	    driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("Alphacity123");
        Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/content/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("alphacity@123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/content/span")).click();
        Thread.sleep(3000);
        System.out.println("Sign-In Successfull");
        Thread.sleep(3000);
	}

	
}
