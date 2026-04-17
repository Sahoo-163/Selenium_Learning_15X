package com.theTestingAcademy.Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_002 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(" https://openai.com/index/chatgpt/");
    }
}
