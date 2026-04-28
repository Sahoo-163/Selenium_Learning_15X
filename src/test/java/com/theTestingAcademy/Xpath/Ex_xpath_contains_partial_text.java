package com.theTestingAcademy.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_xpath_contains_partial_text {
    @Test
    public void cura_partialtext() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//a[contains(text(),\"Make\")]"));
        element.click();

        driver.quit();
    }
}
