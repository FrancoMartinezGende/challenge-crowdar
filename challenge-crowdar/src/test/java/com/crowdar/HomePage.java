package com.crowdar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final By burgerMenuBtn = By.id("react-burger-menu-btn");
    private final By itemToShop = By.xpath("//div[normalize-space(text())='Sauce Labs Backpack']");
    private final By shoppingCartBtn = By.xpath("//div[@id='shopping_cart_container']//a[1]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean burgerMenuAvailable() {
        return isDisplayed(burgerMenuBtn);
    }

    public void openMenu() {
        click(burgerMenuBtn);
    }

    public void searchProduct() {
        click(itemToShop);
    }

    public void openShoppingCart() {
        click(shoppingCartBtn);
    }
}
