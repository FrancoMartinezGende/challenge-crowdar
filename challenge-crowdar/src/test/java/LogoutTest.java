import com.crowdar.BaseTest;
import com.crowdar.HomePage;
import com.crowdar.MenuPage;
import org.junit.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        homePage.burgerMenuAvailable();
        homePage.openMenu();
        Thread.sleep(500);
        MenuPage menuPage = new MenuPage(driver);
        menuPage.logout();
        Thread.sleep(500);
        assert loginPage.validateLoginBtn();
    }

}
