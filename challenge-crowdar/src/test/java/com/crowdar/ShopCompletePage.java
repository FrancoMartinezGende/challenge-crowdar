package com.crowdar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopCompletePage extends BasePage {
    private final By shopCompletedImg = By.xpath("//img[@data-test='pony-express']");

    public ShopCompletePage(WebDriver driver) {
        super(driver);
    }

    public Boolean verifyShop() {
        return isDisplayed(shopCompletedImg);
    }
}
