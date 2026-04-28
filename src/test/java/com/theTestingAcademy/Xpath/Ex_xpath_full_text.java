package com.theTestingAcademy.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_xpath_full_text {

    @Test
    public void katalon_fulltext() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Thread.sleep(2000);

        WebElement element_button = driver.findElement(By.xpath("//a[text()=\"Make Appointment\"]"));
        element_button.click();
        driver.quit();
    }
}
