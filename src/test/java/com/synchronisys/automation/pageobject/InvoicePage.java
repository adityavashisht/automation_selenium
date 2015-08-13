package com.synchronisys.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by vashishta on 8/13/15.
 */
public class InvoicePage {

    private final WebDriver driver;

    public InvoicePage(WebDriver driver) {

        this.driver = driver;
    }

    By clientsSelectorLocator = By.id("clientSelect");
    private final String CLIENT = "Expense";

    public InvoicePage selectClient() throws Exception {


        WebElement clientSelection = driver.findElement(clientsSelectorLocator);


        Select dropDown = new Select(clientSelection);
        String selected = dropDown.getFirstSelectedOption().getText();

        System.out.println(selected);

        List<WebElement> Options = dropDown.getOptions();
        for (WebElement option : Options) {
            if (option.getText().contains(CLIENT)) {
                option.click(); //select option here;
            }
        }
        Thread.sleep(5000);
        return this;
    }
}
