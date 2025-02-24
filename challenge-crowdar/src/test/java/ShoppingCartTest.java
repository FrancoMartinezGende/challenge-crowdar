import com.crowdar.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShoppingCartTest extends BaseTest {

    @Test
    public void shoppingCartTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ItemPage itemPage = new ItemPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);

        assertTrue(homePage.burgerMenuAvailable());
        homePage.searchProduct();
        Thread.sleep(500);
        itemPage.shopItem();
        Thread.sleep(500);
        itemPage.backToProducts();
        Thread.sleep(500);
        homePage.openShoppingCart();
        String itemPrice = shoppingCartPage.getItemPrice();
        String itemName = shoppingCartPage.getItemName();
        Assert.assertEquals("$29.90", itemPrice);
        Assert.assertEquals("Sauce Labs Backpack", itemName);
    }

    @Test
    public void validateItemShopTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ItemPage itemPage = new ItemPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        CheckoutInformationPage checkoutPage = new CheckoutInformationPage(driver);
        CheckoutOverviewPage overViewPage = new CheckoutOverviewPage(driver);
        ShopCompletePage shopCompletePage = new ShopCompletePage(driver);

        assertTrue(homePage.burgerMenuAvailable());
        homePage.searchProduct();
        Thread.sleep(500);
        itemPage.shopItem();
        Thread.sleep(500);
        itemPage.backToProducts();
        Thread.sleep(500);
        homePage.openShoppingCart();
        shoppingCartPage.checkOut();
        checkoutPage.completeDataUser("Franco", "Martinez", "7600");
        checkoutPage.accept();
        Thread.sleep(500);
        overViewPage.finishShop();
        assert shopCompletePage.verifyShop();
    }
}
