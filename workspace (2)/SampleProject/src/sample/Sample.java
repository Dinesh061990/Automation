package sample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Sample {
	WebDriver driver;
	@BeforeClass
	public void load_url()
	{
	 System.setProperty("webdriver.gecko.driver", "/home/developn51/Downloads/geckodriver");
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("url");
	} 
   @Test
   public void doTest1(){
       System.out.println("Hello from Test 1");
   }
   @Test
   public void doTest2(){
       System.out.println("Hello from Test 2");
   }
   @Test
   public void doTest3(){
       System.out.println("Hello from Test 3");
   }
   @Test
   public void doTest4(){
       System.out.println("Hello from Test 4");
   }
   @Test
   public void doTest5(){
       System.out.println("Hello from Test 5");
   }    
}