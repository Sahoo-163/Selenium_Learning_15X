package com.theTestingAcademy.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators_003 {

    @Test
    public void cura_health(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        //make an appointment
        WebElement make_appointment = driver.findElement(By.linkText("Make Appointment"));
        make_appointment.click();

        // Enter Username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("John Doe");

        //Enter Password
        WebElement password = driver.findElement(By.id( "txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        //click on logi
        WebElement login = driver.findElement(By.tagName("button"));
        login.click();

        //Assert.assertEquals(login.getTagName(),"Make Appointment");


    }
}
