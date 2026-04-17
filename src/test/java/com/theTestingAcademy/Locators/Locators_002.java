package com.theTestingAcademy.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.temporal.ValueRange;

public class Locators_002 {

    @Test
    public  void start_free_trial() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");

        WebElement element = driver.findElement(By.id("page-v1-step1-email"));
        element.sendKeys("sahoo@gmail.com");

        WebElement checkbox1 = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox1.click();

        WebElement submit = driver.findElement(By.tagName("button"));
        submit.click();

        Thread.sleep(5000);

        WebElement Validation = driver.findElement(By.className("invalid-reason"));
        Validation.getText();

     //   Thread.sleep(5000);

        Assert.assertEquals(Validation.getText(),"gmail.com doesn't look like a business domain. Please use your business email.");

driver.quit();


    }
}
