package logics;

import com.microsoft.playwright.Page;
import pages.LoginPage;

public class LoginPageLogic extends LoginPage {
    public LoginPageLogic(Page page) {
        super(page);
    }

    public LoginPageLogic enterUsername(String userName){
        userNameInput().fill(userName);
        return this;
    }

    public LoginPageLogic enterUserPasswordInput(String password){
        userPasswordInput().fill(password);
        return this;
    }

    public MainPageLogic clickLoginButton(){
        loginButton().click();
        return new MainPageLogic();
    }
}
