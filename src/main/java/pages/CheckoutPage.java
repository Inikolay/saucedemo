package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CheckoutPage {
    private final Page page;

    public CheckoutPage(Page page) {
        this.page = page;
    }

    public Locator itemBlock(){
        return page.locator("div.cart_item_label");
    }
    public Locator buttonFinish(){
        return page.locator("[data-test='finish']");
    }

    public Locator priceCheckoutPage(){
        return page.locator("div[data-test='inventory-item-price']");
    }
}
