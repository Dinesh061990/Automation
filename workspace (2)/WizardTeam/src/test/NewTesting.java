package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NewTesting {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/home/developn51/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://accounts.google.com/signin");

		// gmail login
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("nanda051288@gmail.com");
		driver.findElement(By.xpath("//content[contains(.,'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("9843506433");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(3000);
		// // some optional actions for reaching gmail inbox
		// driver.findElement(By.xpath("//*[@title='Google apps']")).click();
		// driver.findElement(By.id("gb23")).click();

		// now talking un-read email form inbox into a list
		List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));

		// Mailer name for which i want to check do i have an email in my inbox
		String MyMailer = "me";// dnt want
		// real logic starts here
		for (int i = 0; i < unreademeil.size(); i++) {
			if (unreademeil.get(i).isDisplayed() == true) {
				// now verify if you have got mail form a specific mailer (Note Un-read mails)
				// for read mails xpath loactor will change but logic will remain same
				if (unreademeil.get(i).getText().equals(MyMailer)) {// dnt want
					String UnreadMsg = unreademeil.get(i).getText();
					System.out.println("Yes we have got mail form " + UnreadMsg);
					unreademeil.get(i).click();
					Thread.sleep(2000);
					driver.findElement(By.partialLinkText("192.168.1.240/nura_portal/setPassword.php?/token")).click(); 
					ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
					System.out.println(tabs);
				    driver.switchTo().window(tabs.get(1)); //switches to new tab
				    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dinesh@123");
				    Thread.sleep(2000); 
				    driver.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
			        Thread.sleep(10000);
//				    driver.switchTo().window(tabs.get(0));
//					
					}
				} else {
					System.out.println("No mail form " + MyMailer);
				}
			}
		}
	
	}






