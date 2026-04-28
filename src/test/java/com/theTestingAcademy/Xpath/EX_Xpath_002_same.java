package com.theTestingAcademy.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EX_Xpath_002_same {

    @Test
    public void Orange_website() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("Hacker@4321");

        WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]/h6"));
        element.getText();

        Assert.assertEquals(element.getText(),"PIM");

        driver.quit();


    }
}
