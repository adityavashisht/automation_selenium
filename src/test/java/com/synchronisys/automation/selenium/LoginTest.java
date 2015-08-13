package com.synchronisys.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by vashishta on 8/13/15.
 */
public class LoginTest {

    @Test
    public void newInvoice() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://indasil.billmywork.com/app/secure");

        WebElement element = driver.findElement(By.name("j_username"));
        element.clear();
        element.sendKeys("aditya@indasil.com");

        WebElement password = driver.findElement(By.name("j_password"));
        password.clear();
        password.sendKeys("carapace23");





        WebElement loginButton = driver.findElement(By.id("signIn"));
        loginButton.submit();


        driver.get("https://indasil.billmywork.com/app/money/invoice/list");

        WebElement newInvoice = driver.findElement(By.id("newInvoice"));


        newInvoice.click();

        WebElement textAreaTerms = driver.findElement(By.id("textareaTerms"));
        textAreaTerms.sendKeys("Default terms to be used");

        WebElement clientSelection = driver.findElement(By.id("clientSelect"));


        Select dropDown = new Select(clientSelection);
        String selected = dropDown.getFirstSelectedOption().getText();

        System.out.println(selected);

        List<WebElement> Options = dropDown.getOptions();
        for (WebElement option : Options) {
            if (option.getText().contains("Technologies")) {
                option.click(); //select option here;
            }
        }




    }

    @Test
    public void login(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://indasil.billmywork.com/app/secure");

        WebElement element = driver.findElement(By.name("j_username"));
        element.clear();
        element.sendKeys("aditya@indasil.com");

        WebElement password = driver.findElement(By.name("j_password"));
        password.clear();
        password.sendKeys("carapace23");


        WebElement loginButton = driver.findElement(By.id("signIn"));
        loginButton.submit();
    }


}
