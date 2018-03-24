package Work_area;

import org.openqa.selenium.By;

import Driverin.in_dr;

public class Work_act extends in_dr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
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
		if(dr.findElement(By.xpath(xpath)).isDisplayed()==true)
		{
			return true;
		}
		else
		{
			System.out.println("element not displaying");
			return false;
		}
		
	
		
		
	}

}
