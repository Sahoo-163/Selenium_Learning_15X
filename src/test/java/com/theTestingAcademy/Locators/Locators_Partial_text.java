package com.theTestingAcademy.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators_Partial_text {
    @Test
    public void Partial_link_text() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        WebElement element = driver.findElement(By.partialLinkText("Start"));
        element.click();

        Thread.sleep(5000);

        driver.quit();

    }
}
