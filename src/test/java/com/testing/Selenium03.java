package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium03 {

    @Test
    public void testMethod(){
        // Extension to the Edge Browser
        // YouTube video -. Ad blocker Extension
        // Selenium ?


        /*
         * 1. headless
         * 2. start max
         * 3. window
         * 4. add exnetions
         * 5. 100 of another options - you can use with it
         *
         * */

        EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.addArguments("--");
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver  = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());



    }
}
