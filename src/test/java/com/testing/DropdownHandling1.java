package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownHandling1 {

    @Test(groups = "smoke", priority = 1)
    public void test1() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.orangehrm.com/en/book-a-free-demo/");
        driver.manage().window().maximize();
         WebElement countrlylist =driver.findElement(By.id("Form_getForm_Country"));
        Select select=new Select(countrlylist); // to handle static dropdowns
       // select.selectByIndex(1); 1st way
        //select.selectByValue("India");2nd way
        select.selectByVisibleText("India");

    }
}
