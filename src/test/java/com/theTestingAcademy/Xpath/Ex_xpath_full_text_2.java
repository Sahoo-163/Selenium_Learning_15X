package com.theTestingAcademy.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_xpath_full_text_2 {

    @Test
    public void vwologinbtn() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        Thread.sleep(3000);

        WebElement signin = driver.findElement(By.xpath("//span[text()=\"Sign in\"]"));
        signin.click();

        driver.quit();
    }
}
