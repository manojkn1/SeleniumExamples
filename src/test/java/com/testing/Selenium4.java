package com.testing;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium4 {

    @Test
    public void testMethod(){


        EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.addArguments("--");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL); //preferred

        WebDriver driver  = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
        driver.quit();

        // NONE -> 0.5 ms
        // EAGER - 1
        // NORMAL  - 5-7 Seconds




    }
}
