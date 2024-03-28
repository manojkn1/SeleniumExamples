package com.testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingAlerts {

    @Test(groups = "smoke", priority = 1)
    public void test1() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        // //button[text()='Click for JS Alert'] one way
        //  //button[@onclick='jsAlert()']
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='result']")));
       String result= driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(result);
        Assert.assertEquals(result, "You successfully clicked an alert");


    }
}