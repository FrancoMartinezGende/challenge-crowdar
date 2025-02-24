package com.crowdar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By userNameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void completeUserData(String username, String password) {
        type(userNameInput, username);
        type(passwordInput, password);
    }

    public void login() {
        click(loginButton);
    }

    public boolean validateLoginBtn() {
        return isDisplayed(loginButton);
    }

    public void loginAs(String username, String password) {
        completeUserData(username, password);
        login();
    }
}
