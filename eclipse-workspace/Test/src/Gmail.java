
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
    
    static WebDriver driver = new FirefoxDriver(); 
    
    public static void Open_Gmail() {
        // TODO Auto-generated method stub
        
        driver.get("https://www.google.com/gmail/about/");
        driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
        
                }
    public static void Sign_In() throws InterruptedException {
        
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("dk061990");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/content/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dinesh@43234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/content/span")).click();
        Thread.sleep(3000);
        System.out.println("Sign-In Successfull");
        Thread.sleep(3000);
    }
    
    public static void Compose() throws InterruptedException {
    	
    	driver.findElement(By.xpath("//div[@gh='cm']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("dk061990@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Test");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi Everyone Test");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@data-tooltip-delay='800']")).click();
        Thread.sleep(3000);
        System.out.println("Compose Mail Successfull");
    }
    
    
    public static void Open_Email() throws InterruptedException {
        
    	List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));
    	String MyMailer = "me";
    	for(int i=0;i<unreademeil.size();i++){
    	    if(unreademeil.get(i).isDisplayed()==true){
    	        // now verify if you have got mail form a specific mailer (Note Un-read mails)
    	        // for read mails xpath loactor will change but logic will remain same
    	        if(unreademeil.get(i).getText().equals(MyMailer)){
    	            System.out.println("Yes we have got mail form " + MyMailer);
    	            unreademeil.get(i).click();
    	            // also you can perform more actions here 
    	            // like if you want to open email form the mailer
    	            break;
    	        }else{
    	            System.out.println("No mail form " + MyMailer);
    	        }
    	    }
    	}
    	
        System.out.println("Open Email Successfull");    
    }

	    public static void Sign_Out() throws InterruptedException {
	    	driver.findElement(By.xpath("//div[@style='min-width: 150px;']")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[contains(.,'Sign out')]")).click();
            Thread.sleep(2000);
        System.out.println("Sign-Out Successfull");
    }
    public static void main(String[] args) throws InterruptedException {
                
    	System.setProperty("webdriver.gecko.driver", "/home/dinesh/Downloads/geckodriver");
        
        //System.out.println("done");
        
        Open_Gmail();
        Sign_In();
        Compose();
        Open_Email();
        Sign_Out();
                        
    }

}