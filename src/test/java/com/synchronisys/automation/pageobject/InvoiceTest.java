package com.synchronisys.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by vashishta on 8/13/15.
 */
public class InvoiceTest {

    @Test
    public void loginAndInvoice() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8080/app");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeUsername("aditya@indasil.com");
        loginPage.typePassword("aditya");
        //loginPage.enterPinCode("1234");

        Thread.sleep(1000);

        InvoicePage invoicePage = loginPage.doLogin();
        invoicePage.selectClient();



        driver.quit();
    }
}
