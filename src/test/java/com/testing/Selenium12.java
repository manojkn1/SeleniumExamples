package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Selenium12 {


    @Test(groups = "smoke",priority = 1)
    public void testLogin()  {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

      WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://uat-pc.westconcomstor.com/global/en/market-place/pc.html");
        driver.manage().window().maximize();

          Wait<WebDriver> wait= new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2));


        driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("myPassword12345");

        driver.findElement(By.cssSelector("#idSIButton9")).click();

        driver.findElement(By.xpath("//input[@class='sc-leVUqg cFfKKD']")).sendKeys("0001020777");

        driver.findElement(By.xpath("//button[@class='sc-fhzFiK kdkILV sc-cDCexA hrCvAf']")).click();

        driver.findElement(By.xpath("//button[@id='4000-1-1']")).click();

        driver.findElement(By.xpath("//button[@class='sc-fhzFiK dKGYit']")).click();
        driver.findElement(By.xpath("//button[@class='sc-fhzFiK kdkILV']")).click();
        driver.close();

    }
}


