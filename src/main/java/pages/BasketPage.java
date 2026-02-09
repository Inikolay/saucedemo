package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class BasketPage {
    private final Page page;

    public BasketPage(Page page) {
        this.page = page;
    }

    public Locator itemCart() {
        return page.locator("div.cart_item");
    }

    public Locator buttonCheckout() {
        return page.locator("button#checkout");
    }

    public Locator buttonRemove() {
        return page.locator("#remove-sauce-labs-backpack");

    }
}
