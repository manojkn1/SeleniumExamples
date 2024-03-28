package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Selenium11 {

    @Test(groups = "smoke",priority = 1)
    public void testLogin()  {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://uat-pc.westconcomstor.com/global/en/market-place/pc.html");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='i0116']")));
        driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("am2@westcon.com");
        driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='i0118']")));
        driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("myPassword12345");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#idSIButton9")));
        driver.findElement(By.cssSelector("#idSIButton9")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Search by Reseller')]")));
        driver.findElement(By.xpath("//input[contains(@placeholder,'Search by Reseller')]")).sendKeys("0001020777");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='sc-fhzFiK kdkILV sc-cnEWGb iMItSF']")));
        driver.findElement(By.xpath("//button[@class='sc-fhzFiK kdkILV sc-cnEWGb iMItSF']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='4000-1-1']")));
        driver.findElement(By.xpath("//button[@id='4000-1-1']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='sc-fhzFiK dKGYit']")));
        driver.findElement(By.xpath("//button[@class='sc-fhzFiK dKGYit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='sc-fhzFiK kdkILV']")));
        driver.findElement(By.xpath("//button[@class='sc-fhzFiK kdkILV']")).click();
        driver.close();

    }
}
