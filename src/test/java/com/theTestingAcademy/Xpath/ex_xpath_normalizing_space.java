package com.theTestingAcademy.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex_xpath_normalizing_space {

    @Test
    public  void orangelabs() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(2000);
        WebElement elementspace = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));
        elementspace.click();

        driver.quit();
    }
}
