package logic;

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

    public LoginPageLogic clickLoginButton() {
        loginPage.loginButton().click();
        return this;
    }

    public LoginPageLogic checkIsVisibleErrorMessageForLogin(){
        loginPage.errorMessageForLogin().isVisible();
        return this;
    }

    public MainPageLogic clickLoginButtonGoToMainPage() {
        loginPage.loginButton().click();
        return new MainPageLogic(loginPage.loginButton().page());
    }
}
