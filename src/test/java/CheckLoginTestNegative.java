import jdk.jfr.Description;
import logic.LoginPageLogic;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.TestConfig.URL;


public class CheckLoginTestNegative extends BaseTest {

    private LoginPageLogic loginPageLogic;

    @BeforeMethod
    public void initPageLogic() {
        loginPageLogic = new LoginPageLogic(page);
    }

    @Test()
    @Description("Check login test negative")
    public void testCheckLoginNegative() {
        page.navigate(URL);
        loginPageLogic.clickLoginButton()
                .checkIsVisibleErrorMessageForLogin();
    }
}
