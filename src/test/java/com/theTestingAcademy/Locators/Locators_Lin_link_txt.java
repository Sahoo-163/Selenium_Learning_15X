package com.theTestingAcademy.Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators_Lin_link_txt {

    @Description(" Verify the scenario for link text")
    @Test
    public void link_text(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        WebElement email = driver.findElement(By.linkText("Start a FREE TRIAL"));
        email.click();


        driver.quit();


    }
}
