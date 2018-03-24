package Work_area;

import org.openqa.selenium.By;

public class ww extends Work_act {

	
	public void login() throws InterruptedException
	{
		if(check(Ct_dec.usernamepath)==true)
		{
			dr.findElement(By.xpath(Ct_dec.usernamepath)).sendKeys(Ct_dec.username);
		}
		else
		{
		System.out.println("Element not found");
		}
		if(check(Ct_dec.submitpath)==true)
		{
			//System.out.print("workarea_works_submit");
			click(Ct_dec.submitpath);
		}
		if(check(Ct_dec.passwordpath)==true)
		{
			
			dr.findElement(By.xpath(Ct_dec.passwordpath)).sendKeys(Ct_dec.password);
			
		}
		if(check(Ct_dec.passsubmitpath)==true)
		{
			System.out.println("Entered into this");
			click(Ct_dec.passsubmitpath);
			Thread.sleep(2000);
		}
		
	}
	
	public void validlogin()
	{
		if(check(Ct_dec.gmailpath)==true)
		{
			System.out.print("Successfully logged in");
		}
		else
		{
			System.out.print("Loggin un successful");
			dr.quit();
		}
	}
	public void cmp() throws InterruptedException
	{
		if(check(Ct_dec.composepath)==true)
		{
			click(Ct_dec.composepath);
			dr.findElement(By.xpath(Ct_dec.tomail)).sendKeys(Ct_dec.topwd);
			Thread.sleep(3000);
			dr.findElement(By.xpath(Ct_dec.tosubject)).sendKeys(Ct_dec.tosub);
			Thread.sleep(3000);
			dr.findElement(By.xpath(Ct_dec.tomessage)).sendKeys(Ct_dec.tomes);
			Thread.sleep(3000);
			click(Ct_dec.click);
			System.out.println("completed compose");
		}
		else
		{
			System.out.println("Composing Unsuccessfull");
		}
	}

}

