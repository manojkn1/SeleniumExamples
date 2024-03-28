package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium8 {

@Test
    public void test1() throws InterruptedException {

        ChromeOptions options= new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        WebElement username=driver.findElement(By.id("login-username"));
        username.sendKeys("admin@admin.com");
        WebElement password=driver.findElement(By.id("login-password"));
        password.sendKeys("admin");
        WebElement loginButton=driver.findElement(By.xpath("//button[@data-qa='sibequkica']"));
        loginButton.click();

        Thread.sleep(3000);

    WebElement error = driver.findElement(By.className("notification-box-description"));
    String error_text= error.getText();

    Assert.assertEquals(error_text,"Your email, password, IP address or location did not match" );








    }
}
