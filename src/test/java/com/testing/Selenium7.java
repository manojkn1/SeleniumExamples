package com.testing;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium7 {


    @Test(groups = "QA")

    @Description("Verfiy the current URl, title of VWO app")

    public void testVWOLogin(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vwo.com");

        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Login - VWO");

        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

    }

}
