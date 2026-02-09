package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AddressPage {
    private final Page page;

    public AddressPage(Page page) {
        this.page = page;
    }

    public Locator firstNameInput(){
        return page.locator("#first-name");
    }

    public Locator lastNameInput(){
        return page.locator("#last-name");
    }

    public Locator postalCodeInput(){
        return page.locator("#postal-code");
    }

    public Locator buttonContinue(){
        return page.locator("input#continue");
    }

    public Locator errorMessageContainerError(){
        return page.locator("div.error-message-container error");
    }
}
