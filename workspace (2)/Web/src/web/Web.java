package web;

import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

//import com.gargoylesoftware.htmlunit.javascript.host.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Web {
	static WebDriver driver = new ChromeDriver();

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/home/developn51/Downloads/chromedriver");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// driver.navigate().to("http://demoqa.com/");
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.cssSelector("#menu-item-374>a")).click();
	}

	@Test(dataProvider = "UserDetails", priority = 1)
	public void signup(String firstname, String lastname, String phone, String name, String email) {
		driver.findElement(By.xpath("//a[contains(.,'Registration')]")).click();
		driver.findElement(By.id("name_3_firstname")).sendKeys(firstname);
		driver.findElement(By.id("name_3_lastname")).sendKeys(lastname);
		driver.findElement(By.name("radio_4[]")).click();
	    driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div[1]/input[3]")).click();
		WebElement element = driver.findElement(By.id("dropdown_7"));
		Select se = new Select(element);
		se.selectByVisibleText("India");
		WebElement element1 = driver.findElement(By.id("mm_date_8"));
		Select se1 = new Select(element1);
		se1.selectByVisibleText("12");
		WebElement element2 = driver.findElement(By.id("dd_date_8"));
		Select se2 = new Select(element2);
		se2.selectByVisibleText("5");
		WebElement element3 = driver.findElement(By.id("yy_date_8"));
		Select se3 = new Select(element3);
		se3.selectByVisibleText("1988");
		driver.findElement(By.xpath(".//*[@id='phone_9']")).sendKeys(phone);
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(name);
		driver.findElement(By.xpath(".//*[@id='email_1']")).sendKeys(email);
		driver.findElement(By.id("profile_pic_10")).sendKeys("/home/developn51/Pictures/Screenshot.png");
		driver.findElement(By.id("description")).sendKeys("Test");
		driver.findElement(By.id("password_2")).sendKeys("Pavan@9787602026");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("Pavan@9787602026");
		driver.findElement(By.id("piereg_passwordStrength")).getAttribute("value");
		driver.findElement(By.name("pie_submit")).click();

		String success = driver.findElement(By.xpath(".//*[@id='post-49']/div/p")).getText();
		System.out.println(success);
		String sucessmessgage = "Thank you for your registration";
		String existMessage = "Error";
		if (success.equals(sucessmessgage)) {
			System.out.println("Success");

		} else if (success.contains(existMessage)) {
			System.out.println("Already Existed");

		} else {
			System.out.println("No way");
		}
	}

	@Test(groups="Smoke Test")
	public void frames() {
		driver.findElement(By.xpath(".//*[@id='menu-item-148']")).click();
		// driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		driver.findElement(By.xpath(".//*[@id='ui-id-2']")).click();

		String parentHandle = driver.getWindowHandle();// get the current window handle
		System.out.print(parentHandle);
		driver.findElement(By.xpath(".//*[@id='tabs-2']/div/p/a")).click(); // click some link that opens a new window

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's
													// your newly opened window)

		}
		String current = driver.getCurrentUrl();
		System.out.println(current);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement f = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='page']/div[4]/div/div/div/div[2]/ol/li[1]")));
		f.click();
		driver.close(); // close newly opened window when done with it
		driver.switchTo().window(parentHandle);

	}

	@Test(groups="Smoke Test")
	public void droppable()

	{
		// Draggable Click Event
		driver.findElement(By.xpath(".//*[@id='menu-item-141']/a")).click();
		// Element which needs to drag.
		WebElement From = driver.findElement(By.xpath(".//*[@id='draggableview']/p"));

		// Element on which need to drop.
		WebElement To = driver.findElement(By.xpath(".//*[@id='droppableview']"));

		// Using Action class for drag and drop.
		Actions act = new Actions(driver);

		// Dragged and dropped.
		act.dragAndDrop(From, To).build().perform();

	}

	@Test(groups="Regression")
	public void Tooltip() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='menu-item-99']/a")).click();
		Thread.sleep(2000);
		Actions action1 = new Actions(driver);
		WebElement element = driver.findElement(By.id("age"));
		action1.moveToElement(element).build().perform();

	}

	@Test(groups="Smoke Test")
	public void Tabs() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='menu-item-98']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ui-id-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ui-id-3']")).click();

	}

	@Test(groups="Regression")
	public static void slider() {
		driver.findElement(By.xpath(".//*[@id='menu-item-97']/a")).click();
		int x = 10;
		
	WebElement slider = driver.findElement(By.xpath(".//*[@id='slider-range-max']/span"));
		int width = slider.getSize().getWidth();
		System.out.print(width);
		Actions move = new Actions(driver);
		move.moveToElement(slider, ((width * x) / 50), 0).click();
		
		move.build().perform();
		System.out.println("Slider moved");
	}

	@Test(groups="Regression")
	public void Accordion() throws InterruptedException
	
	{
		driver.findElement(By.xpath(".//*[@id='menu-item-144']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ui-id-6']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ui-id-8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ui-id-10']")).click();
	}
	@Test(groups="Regression")
	public void Datepicker()
	{
	driver.findElement(By.xpath(".//*[@id='menu-item-146']/a")).click();
	driver.findElement(By.xpath(".//*[@id='ui-id-2']")).click();
	driver.findElement(By.xpath(".//*[@id='datepicker2']")).click();
	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[2]/a")).click();
	}
	
	@Test(groups = { "Regression" })
	public void Sortable() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='menu-item-151']/a")).click();
//		// Element which needs to drag.
//		WebElement From = driver.findElement(By.xpath(".//*[@id='sortable']/li[1]"));
//		 
//		WebElement To = driver.findElement(By.xpath(".//*[@id='sortable']/li[6]"));
//		 
		 
		WebElement element = driver.findElement(By.xpath(".//*[@id='sortable']/li[6]")); 
        
		WebElement target = driver.findElement(By.xpath(".//*[@id='sortable']/li[1]"));
    
	   WebElement element1 = driver.findElement(By.xpath(".//*[@id='sortable']/li[4]"));
	 
	   WebElement target1 = driver.findElement(By.xpath(".//*[@id='sortable']/li[2]"));
	   
	   (new Actions(driver)).dragAndDrop(element, target).perform();
	   Thread.sleep(3000);
	   (new Actions(driver)).dragAndDrop(element1, target1).perform();
	}
	
	@DataProvider(name = "UserDetails")

	public static Object[][] credentials() {

		return new Object[][] { { "sathya", "priya", "8888888878", "sathyapriiya", "saathpriya@gmail.com" },
				{ "priya", "ganeshane", "9888885883", "priyaganesh", "priyaganesh@gmail.com" } };

	}
}
