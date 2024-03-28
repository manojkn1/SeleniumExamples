package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium9 {


    @Test
    public void test1() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");
      //  WebElement freeTrialLink= driver.findElement(By.linkText("Start a free trial"));//full text match
        WebElement freeTrialLink= driver.findElement(By.partialLinkText("free trial"));//partial text match
        System.out.println(freeTrialLink.getAttribute("href"));
        freeTrialLink.click();
        driver.close();
    }
}
