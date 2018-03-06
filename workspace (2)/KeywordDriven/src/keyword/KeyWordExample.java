package keyword;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Alert;

//import java.util.concurrent.TimeUnit;
//import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.seleniumhq.jetty9.server.HttpChannelState.Action;


public class KeyWordExample {
	static WebDriver driver;
	static WebDriverWait wait;

	public void open_Browser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "/home/developn51/Downloads/geckodriver");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/home/developn51/Downloads/chromedriver");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", "D:/Jars/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	public void enter_URL(String URL) {
		driver.navigate().to(URL);
	}

	public By locatorValue(String locatorTpye, String value) {
		By by;
		switch (locatorTpye) {
		case "id":
			by = By.id(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "xpath":
			by = By.xpath(value);
			break;
		case "css":
			by = By.cssSelector(value);
			break;
		case "linkText":
			by = By.linkText(value);
			break;
		case "partialLinkText":
			by = By.partialLinkText(value);
			break;
		default:
			by = null;
			break;
		}
		return by;
	}

	public void enter_Text(String locatorType, String value, String text) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.sendKeys(text);
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public void click_On_Link(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public void click_On_Image(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			String downloadFilepath = "\\home\\developn51\\Downloads";

		    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		    chromePrefs.put("profile.default_content_settings.popups", 0);
		    chromePrefs.put("download.default_directory", downloadFilepath);
		    ChromeOptions options = new ChromeOptions();
		    HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		    options.setExperimentalOption("prefs", chromePrefs);
		    options.addArguments("--test-type");
		    options.addArguments("--disable-extensions"); //to disable browser extension popup

		    DesiredCapabilities cap = DesiredCapabilities.chrome();
		    cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		    cap.setCapability(ChromeOptions.CAPABILITY, options);
			
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {	
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public void Select(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement webElement = driver.findElement(locator);
			webElement.sendKeys(Keys.DOWN);

			webElement.sendKeys(Keys.ENTER);

		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public void click_On_Button(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
		}
	}

	public void Upload(String locatorType, String value, String text) throws AWTException {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.sendKeys(text);

		} catch (InvalidArgumentException e) {
			System.err.format("No Element Found to perform click" + e);
		}
	}

	public void Select_by_value(String locatorType, String value, String searchText) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);

			WebElement dropdown = driver.findElement(locator);
			dropdown.click();

			List<WebElement> options = dropdown.findElements(By.tagName("li"));
			for (WebElement option : options) {
				if (option.getText().equals(searchText)) {
					option.click(); // click the desired option
					break;

				}
			}
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public void Wait(String locatorType, String value) throws InterruptedException {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebDriverWait wait = new WebDriverWait(driver, 120);
			// WebElement element =
			// wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
			WebElement elements = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			elements.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
		}
	}
	public void DoubleButton(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			Actions Dble =new Actions(driver);
			WebElement element = driver.findElement(locator);
			Dble.doubleClick(element).build().perform();
			
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
		}
	}
	

	public void Alert() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void Thread() throws InterruptedException {
		Thread.sleep(5000);
	}

	public void close_Browser() {
		driver.quit();
	}
}