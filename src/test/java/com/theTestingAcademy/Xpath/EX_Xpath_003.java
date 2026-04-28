package com.theTestingAcademy.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EX_Xpath_003 {

    @Test
    public  void app_vwo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        username.sendKeys("sahoo@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("abcd@123");

        WebElement signin = driver.findElement(By.xpath("//span[@data-qa=\"ezazsuguuy\"]"));
        signin.click();

        Thread.sleep(2000);

        WebElement validation = driver.findElement(By.xpath("//div[@class=\"notification-box-description\"]"));
        Thread.sleep(2000);
        Assert.assertEquals(validation.getText(), "Your email, password, IP address or location did not match");

        driver.quit();

    }
}
