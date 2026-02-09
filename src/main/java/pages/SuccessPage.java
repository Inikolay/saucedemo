package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SuccessPage {
    private final Page page;

    public SuccessPage(Page page) {
        this.page = page;
    }

    public Locator imageSuccessOrder() {
        return page.locator("img.pony_express");
    }

    public Locator buttonBackHome(){
        return  page.locator("#back-to-products");
    }
}
