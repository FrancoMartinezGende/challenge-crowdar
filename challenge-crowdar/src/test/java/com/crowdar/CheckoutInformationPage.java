package com.crowdar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationPage extends BasePage {
    private final By firstNameTxt = By.id("first-name");
    private final By lastNameTxt = By.id("last-name");
    private final By zipCodeTxt = By.id("postal-code");
    private final By continueBtn = By.id("continue");

    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    public void completeDataUser(String name, String lastName, String zipCode) {
        type(firstNameTxt, name);
        type(lastNameTxt, lastName);
        type(zipCodeTxt, zipCode);
    }

    public void accept() {
        click(continueBtn);
    }
}
