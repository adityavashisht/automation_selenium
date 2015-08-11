package com.synchronisys.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by vashishta on 8/11/15.
 */
public class FirstTest {

    @Test
    public void first() throws Exception {
        System.out.println("Test");
    }

    @Test
    public void driver() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("https:/www.google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Cheese!");

        element.submit();

    }


}
