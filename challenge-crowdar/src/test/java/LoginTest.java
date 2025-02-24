import com.crowdar.BaseTest;
import com.crowdar.HomePage;
import org.junit.Test;

public class LoginTest extends BaseTest {


    @Test
    public void loginTest() {
        HomePage homePage = new HomePage(driver);
        assert homePage.burgerMenuAvailable();
    }
}
