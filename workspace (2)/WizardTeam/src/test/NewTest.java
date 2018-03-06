package test;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class NewTest{
	@Test(priority = 1)
	public void beforeClass() {
		Login login=new Login();
        try {
        	login.LoginTest();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


//
//	@Test(priority = 2)
//	public void UserCreation() throws InterruptedException {
//		
//		// Login Using Admin User and Creating New User
//		
//		driver.findElement(By.xpath("//a[@href='/signin']")).click();
//		driver.findElement(By.id("sign-in-2-email")).sendKeys("un");
//		driver.findElement(By.id("sign-in-1-password")).sendKeys("pwd");
//		driver.findElement(By.xpath("//button[@class='btn btn-raised btn-lg btn-secondary btn-block']")).click();
		/*
		 * driver.findElement(By.xpath("//img[contains(@class,'m-t-0')]")).click();
		 * 
		 * driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).
		 * click(); driver.findElement(By.xpath("//a[@href='/adduser']")).click();
		 * driver.findElement(By.xpath("//div[@class='left-sidebar-backdrop fade in']"))
		 * .click(); driver.findElement(By.name("name")).sendKeys("che");
		 * driver.findElement(By.name("email")).sendKeys("che1@gmail.com");
		 * driver.findElement(By.name("phone")).sendKeys("9500232668");
		 * driver.findElement( By.xpath(
		 * "html/body/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/form/div[4]/button"
		 * )) .click(); Thread.sleep(4000);
		 * driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click(); //
		 * Clicking the UserList driver.findElement(By.
		 * xpath("//button[@class='btn btn-secondary bmd-btn-fab']")).click();
		 */
//	}

	/*@Test(priority = 3)
	public void roleList() throws InterruptedException {
		
		// Role List
		
		driver.findElement(By.xpath("//img[contains(@class,'m-t-0')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).click();
		driver.findElement(By.xpath("//a[@href='/rolelist']")).click();
		driver.findElement(By.xpath("//a[@href='/dashboard']")).click();
		driver.findElement(By.xpath("//button[@title='Add Role']")).click();
		driver.findElement(By.xpath("//input[@name='roleName']")).sendKeys("System Admin");
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		Thread.sleep(2000);
		String alertMsg = "Duplicate Role Name";
		String alertSuccess = "Duplicate Role Name";
		if (alertMsg.equals(alertSuccess)) {
			driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
			driver.findElement(By.xpath("//input[@name='roleName']")).clear();
			driver.findElement(By.xpath("//input[@name='roleName']")).sendKeys("System Role");
			driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-secondary bmd-btn-fab']")).click();
		}
	}*/

	/*@Test(priority = 3)
	public void applicationList() {
		
		//Application List
		
		driver.findElement(By.xpath("//img[contains(@class,'m-t-0')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).click();
		driver.findElement(By.xpath("//span[contains(.,'Applications')]")).click();
		driver.findElement(By.xpath("//a[@href='/dashboard']")).click();
	
	}*/

/*
 * @Test(priority = 3) public void UserGroup() throws InterruptedException { //
 * Creating the User Group
 * 
 * driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).
 * click();
 * driver.findElement(By.xpath("//span[contains(.,'User group')]")).click();
 * driver.findElement(By.xpath("//div[@class='left-sidebar-backdrop fade in']"))
 * .click();
 * driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(
 * "harish");
 * driver.findElement(By.xpath("//div[@class='Select-placeholder']")).click();
 * driver.findElement(By.xpath("//div[@class='Select-placeholder']")).sendKeys(
 * Keys.DOWN);
 * driver.findElement(By.xpath("//div[@class='Select-placeholder']")).sendKeys(
 * Keys.ENTER); driver.findElement(By.xpath("//button[@class='btn btn-primary
 * pull-xs-right']")).click(); }
 */

/*
 * @Test(priority = 4) public void Role() throws InterruptedException { //
 * Creating the Role
 * driver.findElement(By.xpath("//i[@class='material-icons menu']")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//button[@class='btn btn-flat collapsed']")).
 * click(); Thread.sleep(2000);
 * driver.findElement(By.xpath("//a[@href='/addrole']")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//div[@class='left-sidebar-backdrop fade in']"))
 * .click(); Thread.sleep(3000);
 * driver.findElement(By.xpath("//input[@name='roleName']")).sendKeys("GreenTT")
 * ; Thread.sleep(2000); driver.findElement(By.
 * xpath("//button[contains(@class,'btn btn-primary pull-xs-right')]")).click();
 * }
 * 
 * @Test(priority = 5) public void RoleSetting()
 * 
 * { // Selecting the RoleSetting driver.findElement(By.
 * xpath("//button[@class='btn btn-rounded btn-outline-primary']")).click();
 * driver.findElement(By.xpath("//select[@class='form-control select_option']"))
 * .click();
 * driver.findElement(By.xpath("//select[@class='form-control select_option']"))
 * .sendKeys(Keys.DOWN);
 * driver.findElement(By.xpath("//select[@class='form-control select_option']"))
 * .sendKeys(Keys.ENTER);
 * driver.findElement(By.xpath("//div[@class='Select-placeholder']")).click();
 * driver.findElement(By.xpath("//div[@class='Select-placeholder']")).sendKeys(
 * Keys.DOWN);
 * driver.findElement(By.xpath("//div[@class='Select-placeholder']")).sendKeys(
 * Keys.ENTER); //
 * driver.findElement(By.xpath("//span[@class='bmd-switch-track']")).sendKeys(
 * Keys.ENTER); //
 * driver.findElement(By.xpath("//button[contains(.,'Save')]")).click(); //
 * driver.findElement(By.xpath("//button[contains(.,'Cancel')]")).click(); //
 * Viewing the RoleList
 * driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();
 * 
 * }*/
 
//	@Test(priority = 6)
//	public void Profile() throws InterruptedException {
//		driver.findElement(By.xpath("html/body/div[1]/div/nav/div[2]/a/div/img")).click();
//		driver.findElement(By.xpath("html/body/div[1]/div/nav/div[2]/div/a[1]/span")).click();
//		driver.findElement(By.xpath("//input[@class='form-control']")).click();
//		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nanda");
//		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
//		driver.findElement(By.xpath(
//				"html/body/div[1]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[3]/div/input")).sendKeys("98455412233");
//		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Ketti");
//		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Ooty");
//		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TamilNadu");
//		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("India");
//		driver.findElement(By.xpath("//input[contains(@name,'zipcode')]")).sendKeys("643215");
//		driver.findElement(By.xpath("//button[contains(.,'Update Profile')]")).click();
//	
//	}

 /* @Test(priority = 7) public void ChangePassword()throws InterruptedException {
  //Changing the Password
  driver.findElement(By.xpath("//img[@alt='badge']")).click();
  Thread.sleep(5000);
 * driver.findElement(By.xpath("//span[contains(.,'Change Password')]")).click()
 * ; Thread.sleep(3000);
 * driver.findElement(By.xpath("//input[@name='oldPass']")).sendKeys("Test");
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//input[@name='newPass']")).sendKeys("test@1234"
 * ); Thread.sleep(3000);
 * driver.findElement(By.xpath("//input[@name='conPass']")).sendKeys("test@1234"
 * ); Thread.sleep(3000);
 * driver.findElement(By.xpath("//button[@type='button']")).click();
 * Thread.sleep(3000); Alert alert = driver.switchTo().alert(); alert.accept();
 * driver.findElement(By.xpath("//img[@alt='badge']")).click();
 * Thread.sleep(5000);
 * driver.findElement(By.xpath("//span[contains(.,'Logout')]")).click();*/
 
// 
//  } 
@AfterClass
public void shut() {
	Login.shutDownSelenium();
}
}
