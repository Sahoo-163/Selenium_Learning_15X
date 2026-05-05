package com.theTestingAcademy.WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtables_learning {

    @Description("Buliding of test webtables")
    @Test
    public  void webtables_001(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");

        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        table.getText();

        WebElement contactdetails = driver.findElement(By.xpath("//table[@id = \"customers\"]/tbody/tr[2]/td[2]"));
        contactdetails.getSize();

        System.out.println(contactdetails);

        //xpath - "//table[@id = \"customers\"]/tbody/tr[2]/td[2]"
         String first_element = "//table[@id = 'customers']/tbody/tr[";
         String second_element = "]/td[";
         String third_element = "]";

         Integer row = driver.findElements(By.xpath("//table[@id = \"customers\"]/tbody/tr")).size();
         Integer column = driver.findElements(By.xpath("//table[@id = \"customers\"]/tbody/tr[2]/td")).size();

         for( int i =2 ; i<= row; i++){
             for (int j =1 ; j <= column; j++){
                 String table_details = first_element + i + second_element +j + third_element;
                // System.out.println(table_details);
                 String names = driver.findElement(By.xpath(table_details)).getText();
                 System.out.println(names);

                 if (names.contains("Roland Mendel")){
                     String country_name = table_details+ "/following-sibling::td";
                     String country_name_text = driver.findElement(By.xpath(country_name)).getText();
                     String Company_name = table_details+ "/preceding-sibling::td";
                     String Company_name_text = driver.findElement(By.xpath(Company_name)).getText();
                     System.out.println("Roland Mendel" + "belongs to" + country_name_text + Company_name_text);
                 }
             }
         }

        driver.quit();


    }
}
