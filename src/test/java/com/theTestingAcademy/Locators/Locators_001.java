package com.theTestingAcademy.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators_001 {

    @Test
    public void vwo_login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        //login-->>
        WebElement login = driver.findElement(By.id("login-username"));
        login.sendKeys("sahoo@gmail.com");

        //Password -->>
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password");
        //Thread.sleep(5000) ;

        //submitbutton -->>

        WebElement submitbutton = driver.findElement(By.id("js-login-btn"));
        submitbutton.click();

        //Validaton message
        WebElement validation = driver.findElement(By.className("notification-box-description"));
        System.out.println(validation.getText());

        Thread.sleep(5000);

        Assert.assertEquals(validation.getText(), "Your email, password, IP address or location did not match");
        driver.quit();
    }
}
