package logics;

import com.microsoft.playwright.Page;
import pages.LoginPage;

public class LoginPageLogic {

    private final LoginPage loginPage;

    public LoginPageLogic(Page page) {
        this.loginPage = new LoginPage(page);
    }

    public LoginPageLogic enterUsername(String username) {
        loginPage.userNameInput().fill(username);
        return this;
    }

    public LoginPageLogic enterUserPasswordInput(String password) {
        loginPage.passwordInput().fill(password);
        return this;
    }

    public MainPageLogic clickLoginButton() {
        loginPage.loginButton().click();
        return new MainPageLogic(loginPage.loginButton().page());
    }
}
