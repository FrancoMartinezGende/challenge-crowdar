import com.crowdar.HttpTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class,
        LogoutTest.class,
        ShoppingCartTest.class,
        HttpTest.class
})
public class TestRunner {
}
