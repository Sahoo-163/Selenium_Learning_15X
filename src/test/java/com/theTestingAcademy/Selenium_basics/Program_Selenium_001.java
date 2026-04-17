package com.theTestingAcademy.Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Program_Selenium_001 {

   @Test
    public  void testselenium(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

       Assert.assertEquals(driver.getTitle(),"https://app.vwo.com/#/login");
       driver.quit();

   }

}
