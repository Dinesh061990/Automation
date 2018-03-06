package cmswizard;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  WebDriver driver;

	@Test(priority = 1)
	public void beforeClass() {
		
		 System.setProperty("webdriver.gecko.driver","/home/developn51/Downloads/geckodriver");
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://192.168.1.118:3000/cmsWizard");
		// driver.manage().window().maximize();

	}
  
@Test(priority = 2)
public void awards() throws InterruptedException {
driver.findElement(By.xpath("//i[contains(.,'event')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='atitle']")).sendKeys("Acheievement");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='year']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//td[@data-value='2010']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Best Entreprenur");
Thread.sleep(5000);
//driver.findElement(By.id("awardImg")).sendKeys("\\home\\developn51\\Pictures\\_4170854.jpg");
WebElement element = driver.findElement(By.xpath("//button[@class='btn btn-sm m-r-10 pull-left uploadBtn']"));
element.click();
uploadFile("/home/developn51/Pictures/_4170854.jpg");
Thread.sleep(3000);
driver.findElement(By.id("Event")).click();
Thread.sleep(2000);
}
@Test(priority = 3)
public void Events() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='title']")).sendKeys("In_auguration");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='year']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(.,'‹')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@name='descr']")).sendKeys("Inauguration Event");
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.xpath("//button[contains(.,'Upload')]"));
	element.click();
	uploadFile("/home/developn51/Pictures/Test.jpg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(.,'People')]")).click();
	Thread.sleep(2000);
}
@Test(priority = 4)
public void Management() throws InterruptedException {
	driver.findElement(By.xpath("//input[contains(@class,'form-control')]")).sendKeys("Gupta");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='mdesignation']")).sendKeys("CEO");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='memail']")).sendKeys("Gupta@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("CEO of the Company");
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//button[contains(.,'Upload')]"));
	element.click();
	uploadFile("/home/developn51/Pictures/images.jpeg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@id='team']")).click();
	Thread.sleep(2000);
}
@Test(priority = 5)
public void Teams() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Ram");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='designation']")).sendKeys("Marketing head");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Ram@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("MR.ram Is a well versed in Marketing Department");
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.xpath("//button[contains(.,'Upload')]"));
	element.click();
	uploadFile("/home/developn51/Pictures/Ram.jpeg");
	Thread.sleep(2000);
}
public static void setClipboardData(String string) {
	//StringSelection is a class that can be used for copy and paste operations.
	   StringSelection stringSelection = new StringSelection(string);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}
public static void uploadFile(String fileLocation) {
    try {
    	//Setting clipboard with file location
        setClipboardData(fileLocation);
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    } catch (Exception exp) {
    	exp.printStackTrace();
    }
}

}