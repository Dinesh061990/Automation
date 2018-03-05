import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class JoinNow {

    WebDriver driver;

    @Test
    public void openBrower() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/home/dinesh/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://chitra.local/riui/riui");
        driver.findElement(By.id("signUpName")).sendKeys("Nanda");
        Thread.sleep(3000);
        driver.findElement(By.id("signUpEmail")).sendKeys("nanda051288@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("signUpMobile")).sendKeys("9787602026");
        Thread.sleep(3000);
        driver.findElement(By.id("signUpSubmit")).click();
        Thread.sleep(5000);
//        driver.findElement(By.xpath("//div[@class='jconfirm-title-c jconfirm-hand']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//span[contains(.,'Confirm!')]")).click();
//        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        
    }
    }
