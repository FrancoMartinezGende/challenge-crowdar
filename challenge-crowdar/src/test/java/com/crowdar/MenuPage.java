package com.crowdar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class MenuPage extends BasePage{
private final By logoutBtn = By.id("logout_sidebar_link");

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public void logout(){
        click(logoutBtn);
    }
}
