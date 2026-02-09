import jdk.jfr.Description;
import logics.LoginPageLogic;
import logics.MainPageLogic;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTestPositive extends BaseTest {

    private LoginPageLogic loginPageLogic;
    private String url = "https://www.saucedemo.com";

    @BeforeMethod
    public void initPageLogic() {
        loginPageLogic = new LoginPageLogic(page);
    }

    @Test()
    @Description("test")
    public void testLoginPositive() {
        page.navigate(url);
        MainPageLogic mainPage = loginPageLogic.enterUsername("standard_user")
                .enterUserPasswordInput("secret_sauce")
                .clickLoginButton();
    }
}
