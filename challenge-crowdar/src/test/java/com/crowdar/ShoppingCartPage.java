package com.crowdar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {
    private final By itemPriceTxt = By.xpath("//div[@class='item_pricebar']//div[1]");
    private final By itemNameTxt = By.xpath("//div[@data-test='inventory-item-name']");
    private final By checkOutBtn = By.id("checkout");

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public String getItemPrice() {
        return getText(itemPriceTxt);
    }

    public String getItemName() {
        return getText(itemNameTxt);
    }

    public void checkOut() {
        click(checkOutBtn);
    }
}
