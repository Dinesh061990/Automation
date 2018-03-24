
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewGmail {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    // Initialize WebDriver
    WebDriver driver = new FirefoxDriver();
//    System.setProperty("driver.webdriver.geckodriver","/home/dinesh/Downloads/geckodriver");
    // Maximize Window
//   driver.manage().window().maximize();
  
    // Wait For Page To Load
//    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   
   //Navigate to Google webstites
    System.setProperty("driver.webdriver.geckodriver","/home/dinesh/Downloads/geckodriver");
   driver.get("https://www.gmail.com");
/*CASE- 1. Both User name and Password are entered correctly. 
Check whether Email field exists or not */
    try
        {
          WebElement a1 = driver.findElement(By.xpath("//input[@aria-label='Email or phone']"));
          System.out.println("---------Emaild exists --------------\n-----------------------");
          a1.sendKeys("dk061990@gmail.com");
          driver.findElement(By.xpath("//content[contains(.,'Next')]")).click();
         }
    catch(Throwable e)
         {
         System.out.println("Emaild not found: " + e.getMessage());
         }

    //Check whether Password field exists or not
     try
        {
	     WebElement password = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
         System.out.println("----------Passwordd exits ------------\n-----------------------");
         password.sendKeys("Dinesh@43234");
         driver.findElement(By.xpath("//content[@class='CwaK9']")).click();
        }
    catch(Throwable e)
        {
	 System.out.println("Passwordd not found: " + e.getMessage());
        }

     //Asserting the Sign In button exists or not and clicking it
    try
       {
	WebElement button = driver.findElement(By.id("signIn System.out.println(\"-------Signutton exists----------\\n-----------------------\""));
       //To uncheck the "Check sign in" checkbox
       WebElement check_stay_sign_in = driver.findElement(By.xpath("//*[@id='PersistentCookie']"));
        check_stay_sign_in.click();   
	button.click();
        }
    catch(Throwable e)
        {
	System.out.println("Signbutton not found: "+ e.getMessage());
        }
    //Check if login was proper or not
    try
        {
	WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
        String text = GmailText.getText();
        if(text.equals("Primary"))
       {
	System.out.println("----------Sucessfuln -------\n-----------------------");
       }else
       {
	System.out.println("----------Loginure ----------\n-----------------------");
	}
       }
     catch(Throwable e)
        {
	 System.out.println("Inbox not found: "+e.getMessage());
        }
    //===
    //Asserting and click on the Account link which contain Signout button.
     try
        {
	WebElement person = driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span"));
        System.out.println("--------Theunt link containing Signout button exists ---------\n-----------------------");
	person.click();
       }
    catch(Throwable e)
       {
	System.out.println("Linkthe drop-down not found: "+e.getMessage());
        }


    //Asserting and clicking on the Signout button.
    try
       {	
	WebElement signout = driver.findElement(By.xpath("//*[@id='gb_71']"));
        System.out.println("--------Signbutton exists  ---------\n-----------------------");
	signout.click();
        }
    catch(Throwable e)
        {
	System.out.println("Signbutton not found: "+e.getMessage());
        }

    //Check whether Signout was proper or not.
    try
       {	
       WebElement GmailText = driver.findElement(By.xpath("//divss = 'banner']/h1"));
       String text = GmailText.getText();
       if(text.equals("One account. All of Google."))
       {
       System.out.println("----------Signwas successful -------");
       }
     else
       {
        System.out.println("----------Signwasn't successful ----------");
	}
        }

    catch(Throwable e)
        {
	System.out.println("Signlink not found: "+e.getMessage());
        }


    // CASE- 2. Both Email and Password Fields are blank.
    try
        {
	WebElement button = driver.findElement(By.id("signInbutton.click()"));			        
WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
String text = GmailText.getText();
if(text.equals("Primary"))
{
   System.out.println("----------Sucessfuln -------");
}
else
{
	System.out.println("----------Loginure ----------");
		}
		
}
catch(Throwable e)
{
		System.out.println("Erroril and Password fields are blank. \n----------------------- ");
System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
  }


// CASE- 3. Email field is filled and Password field is blank
try
{		
		WebElement email = driver.findElement(By.id("Emailemail.sendKeys(abcd123@gmail.com)"));
WebElement button = driver.findElement(By.id("signInbutton.click()"));


WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
String text = GmailText.getText();
if(text.equals("Primary"))
{
System.out.println("----------Sucessfuln -------\n-----------------------");
}
else
{
System.out.println("----------Loginure ----------\n-----------------------");
		}
		
 }
catch(Throwable e)
 {
		System.out.println("Errorsword field is blank. \n-----------------------");
System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
 }	

driver.findElement(By.id("Email")).clear();


// CASE- 4. Email field is blank and Password field is filled

try
{		
WebElement password = driver.findElement(By.id("Passwdpassword.sendKeys(Rest)"));
WebElement button = driver.findElement(By.id("signInbutton.click()"));


WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
String text = GmailText.getText();
if(text.equals("Primary"))
{
System.out.println("----------Sucessfuln -------");
}
else
{
System.out.println("----------Loginure ----------");
		}
			
}
catch(Throwable e)
{
    	System.out.println("Erroril field is blank. \n-----------------------");
System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
 }
  
driver.findElement(By.id("Passwd"));


//CASE- 5. Email and Password are entered wrong 	

try
{
		 WebElement email = driver.findElement(By.id("Email email.sendKeys()"));
 WebElement password = driver.findElement(By.id("Passwd password.sendKeys()"));
 WebElement button = driver.findElement(By.id("signIn button.click()"));
 WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
 String text = GmailText.getText();
 if(text.equals("Primary"))
 {
 System.out.println("----------Sucessfuln -------");
 }
 else
 {
 System.out.println("----------Loginure ----------");
		 }
		 
  }
catch(Throwable e)
{
	
	  System.out.println("Errororrect Email and Password. \n-----------------------");		  
  System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
}
 
driver.findElement(By.id("Email"));
driver.findElement(By.id("Passwd"));
		
	
 // CASE- 6. Email is wrong and Password is correct 	
 try 
 {
	 
		WebElement email = driver.findElement(By.id("Emailemail.sendKeys(Test@.com)"));
WebElement password = driver.findElement(By.id("Passwdpassword.sendKeys(Test)"));
WebElement button = driver.findElement(By.id("signInbutton.click()"));
WebElement Inbox = driver.findElement(By.xpath("//*[@id=':53']/div/div[1]/span/a"));
if(Inbox != null) 
{
System.out.println("Sucessfuln \n -----------------");
} 
else 
{
System.out.println("Loginure");
		}
  } 
 catch(Throwable e) 
 {
	  
	  System.out.println("Errororrect Email. \n-----------------------");
  System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
  }
 
  driver.findElement(By.id("Email")).clear();
  driver.findElement(By.id("Passwd")).clear();
  
  
//CASE- 7. Email is correct and Password is wrong 	
 try
 {
	 WebElement email = driver.findElement(By.id("Email email.sendKeys(Dk061990@gmail.com)"));
 WebElement password = driver.findElement(By.id("Passwd password.sendKeys(Dinesh@123)"));
 WebElement button = driver.findElement(By.id("signIn	 button.click()"));
	 
 
	 WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
 String text = GmailText.getText();
 if(text.equals("Primary"))
 {
 System.out.println("----------Sucessfuln -------");
 } 
 else
 {
 System.out.println("----------Loginure ----------");
			}
  }
 catch(Throwable e)
 {
	   System.out.println("Errororrect Password. \n-----------------------");			  
   System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
  }

  driver.findElement(By.id("Email")).clear();
  driver.findElement(By.id("Passwd")).clear();

//closing current driver window	
		driver.close();
		
	}

}
