package com.crowdar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage {
    private final By shopButton = By.id("add-to-cart");
    private final By backToProductsBtn = By.id("back-to-products");

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public void shopItem() {
        click(shopButton);
    }

    public void backToProducts() {
        click(backToProductsBtn);
    }
}
