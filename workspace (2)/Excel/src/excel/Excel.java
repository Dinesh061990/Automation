package excel;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class Excel {
 
WebDriver driver;
Workbook wb;
Sheet sh1;
int numrow;
String username;
String password;
 
@BeforeTest
public void Setup()
 
{
driver=new FirefoxDriver();
System.setProperty("webdriver.FirefoxDriver","/home/developn51/Downloads/geckodriver");
driver.manage().window().maximize();
driver.get("http://www.facebook.com");
}
 
@Test(dataProvider="testdata")
public void TestFireFox(String uname,String password1) throws InterruptedException
 
{
 
driver.findElement(By.id("email")).clear();
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys(uname);
Thread.sleep(2000);
driver.findElement(By.id("pass")).clear();
Thread.sleep(2000);
driver.findElement(By.id("pass")).sendKeys(password1);
Thread.sleep(2000);
}
 
@DataProvider(name="testdata")
public Object[][] TestDataFeed() throws IOException{
 
try {
 

wb=Workbook.getWorkbook(new File("//home//developn51//Documents//Exportdata.xls"));
 

sh1= wb.getSheet(0);
 

numrow=  sh1.getRows();
}
catch (BiffException e)
 
{
e.printStackTrace();
}
 

Object [][] facebookdata=new Object[numrow][sh1.getColumns()];
 

for(int i=0;i<numrow;i++){
 

facebookdata[i][0]=sh1.getCell(0,i).getContents();

facebookdata[i][1]=sh1.getCell(1,i).getContents();
 
}
 

return facebookdata;
}
 
@AfterTest
public void QuitTC(){
 
driver.quit();
}
 

}