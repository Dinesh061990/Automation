package com.hybridFramework.login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hybridFramework.testBase.TestBase;

public class login {
 @Test
 public static void userlogin( ) {
    TestBase t=new TestBase();
    t.getBrowser("firefox")  ;
    
    try {
        t.loadPropertiesFile();
        t.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        t.driver.get(t.OR.getProperty("url"));
        t.driver.findElement(By.xpath(t.OR.getProperty("user"))).click();
        t.driver.findElement(By.xpath(t.OR.getProperty("usrname"))).sendKeys(t.OR.getProperty("username"));
        t.driver.findElement(By.xpath(t.OR.getProperty("pwd"))).click();
        t.driver.findElement(By.xpath(t.OR.getProperty("pwd"))).sendKeys(t.OR.getProperty("password"));
        t.driver.findElement(By.xpath(t.OR.getProperty("submit"))).click();
        
//        driver.findElement(By.id("sign-in-2-email")).sendKeys("nanda051288@gmail.com");
//        driver.findElement(By.id("sign-in-1-password")).sendKeys("nanda@123");
//        driver.findElement(By.xpath("//button[@class='btn btn-raised btn-lg btn-secondary btn-block']")).click();
//  
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    
 }
}

