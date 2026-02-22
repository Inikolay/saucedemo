package firstTest;

import io.qameta.allure.Description;
import logic.LoginPageLogic;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.TestConfig.URL;


public class CheckLoginTestNegative extends BasePlaywrightTest {

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
