package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public Locator userNameInput() {
        return page.locator("#user-name");
    }

    public Locator userPasswordInput() {
        return page.locator("#password");
    }

    public Locator loginButton() {
        return page.locator("#login-button");
    }
}
