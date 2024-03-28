package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium10 {

    @Test
    public void test1() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        Thread.sleep(3000);
        List<WebElement> all_a_tag =driver.findElements(By.tagName("a"));
        System.out.println(all_a_tag.size());
        for (WebElement element:all_a_tag){
            System.out.println(element.getText());
        }

         driver.quit();

    }
}
