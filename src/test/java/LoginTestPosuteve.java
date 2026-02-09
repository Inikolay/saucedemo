import base.BaseTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.sun.org.glassfish.gmbal.Description;
import logics.LoginPageLogic;
import logics.MainPageLogic;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

public class LoginTestPosuteve extends BaseTest {

    private LoginPageLogic pageLogic;
    private MainPageLogic mainPageLogic;
    private Page page;
    private Browser browser;
    private Playwright playwright;

    @BeforeMethod
    public void initPageLogic() {
        pageLogic = new LoginPageLogic(page);
    }

    @Test
    @Description("Login verification positive test")
    public void testLoginPosuteve() {
        page.navigate("https://www.saucedemo.com");
        pageLogic.enterUsername("standard_user")
                .enterUserPasswordInput("secret_sauce")
                .clickLoginButton();
    }
}
