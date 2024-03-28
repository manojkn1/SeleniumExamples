package com.testing;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandlingWebTables2 {

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver();
        String URL = "https://awesomeqa.com/webtable.html";
        driver.get(URL);
        driver.manage().window().maximize();

        // //table[@id='customers']/tbody/tr[5]/td[2]  hallen ballet xpath
        // //table[@id='customers']/tbody/tr[5]/td[2]/following-sibling::td               country she belongs using xpath axes

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println("---");
        System.out.println(column);

        String first_part = "//table[@id='customers']/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";



        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                String dynamic_xpath = first_part+i+second_part+j+third_part;
             String data= driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data);

                if(data.contains("Helen Bennett")){

                String country= driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]/following-sibling::td ")).getText();
                    System.out.println("Hallen country is   "+country);
                }
            }

        }
    }
}
