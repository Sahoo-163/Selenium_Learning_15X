package com.theTestingAcademy.Small_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mini_project {

    @Test
    public  void ttabank() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement signup = driver.findElement(By.xpath("//button[text()=\"Sign Up\"]"));
        signup.click();

        WebElement fullname = driver.findElement(By.xpath("//input[@placeholder=\"John Doe\"]"));
        fullname.sendKeys("chinmay");

        WebElement email = driver.findElement(By.xpath("//input[@placeholder=\"you@example.com\"]"));
        email.sendKeys("sahoo@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("Abcd@1234@");

        WebElement createaccount = driver.findElement(By.xpath("//button[text()=\"Create Account\"]"));
        createaccount.click();
        Thread.sleep(2000);

        WebElement Trasferfund = driver.findElement(By.xpath("//button[contains(text(),\"Transfer Funds\")]"));
        Trasferfund.click();

        WebElement Amount = driver.findElement(By.xpath("//input[@type=\"number\"]"));
        Amount.sendKeys("4000");
        Thread.sleep(2000);

        WebElement Notes = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        Notes.sendKeys("Rent of house");
        Thread.sleep(2000);

        WebElement continue_btn = driver.findElement(By.xpath("//button[contains(text(),\"Continue\")]"));
        continue_btn.click();
        Thread.sleep(2000);

        WebElement confirm_transfer = driver.findElement(By.xpath("//button[contains(text(),\"Confirm Transfer\")]"));
        confirm_transfer.click();

        WebElement Dashboard = driver.findElement(By.xpath("//button[contains(text(),\"Dashboard\")]"));
        Dashboard.click();

        WebElement TotalBalance = driver.findElement(By.xpath("//h3[@class =\"mt-2 text-3xl font-bold\"]"));
        TotalBalance.getText();

        Thread.sleep(2000);


        Assert.assertEquals(TotalBalance.getText(),"$46,000.00");



        driver.quit();







    }
}
