package com.synchronisys.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by vashishta on 8/13/15.
 */
public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameLocator = By.name("j_username");
    By passwordLocator = By.name("j_password");
    By pinCodeLocator = By.id("pinCode");
    By loginButtonLocator = By.id("signIn");



    // The login page allows the user to type their username into the username field
    public LoginPage typeUsername(String username) {
        // This is the only place that "knows" how to enter a username
        driver.findElement(usernameLocator).sendKeys(username);

        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
        return this;
    }

    // The login page allows the user to type their password into the password field
    public LoginPage typePassword(String password) {
        // This is the only place that "knows" how to enter a password
        driver.findElement(passwordLocator).sendKeys(password);

        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
        return this;
    }

    // The login page allows the user to type their password into the password field
    public LoginPage enterPinCode(String pinCode) {
        // This is the only place that "knows" how to enter a password
        driver.findElement(pinCodeLocator).sendKeys(pinCode);

        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
        return this;
    }



    public InvoicePage doLogin() {

        driver.findElement(loginButtonLocator).submit();

        driver.get("http://localhost:8080/app/money/invoice");
        return new InvoicePage(driver);
    }



}
