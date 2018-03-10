package Work_area;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Driverin.in_dr;

public class Work_act extends in_dr {

	
	public void clikce(String xpath1) throws InterruptedException
	{
		System.out.println("enter into this function");
		dr.findElement(By.xpath(xpath1)).click();
		Thread.sleep(2000);
	}
	
	
	public Object webff()
	{
		return this.dr;
	}

	public boolean checkele(String xpath)
	{
		boolean s= false;
		WebElement webElement = dr.findElement(By.xpath(xpath));
		if (webElement==null)
		{
			System.out.println("WebElement not null");
			return false;
		}
		
		if(webElement.isDisplayed()==true)
		{
			System.out.println("Element gets displayed");
			return true;
		}
		else
		{
			System.out.println("element not displaying");
			return false;
		}
		
	
		
		
	}

}
