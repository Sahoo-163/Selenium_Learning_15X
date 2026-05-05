package com.theTestingAcademy.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_001_Webtables {

    @Test
    public  void webtables_selenium(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        //xpath - table[@id = "customers"]/tbody/tr[4]/td[2]
        WebElement element= driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr[4]/td[2]"));
        element.getText();

        String first_element = "//table[@id ='customers']/tbody/tr[";
        String second_element = "]/td[";
        String third_element = "]";

        Integer row = driver.findElements(By.xpath("//table[@id ='customers']/tbody/tr")).size();
        Integer column = driver.findElements(By.xpath("//table[@id ='customers']/tbody/tr[3]/td")).size();

        for ( int i =2 ; i<=row ; i++){
            for (int j= 1 ; j<=column; j++){
                String dynamic_xpath = first_element+i+second_element+j+third_element;
                System.out.println(dynamic_xpath);
                String records = driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(records);




            }
        }











    }

}
