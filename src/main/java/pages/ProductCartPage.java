package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProductCartPage {

    private final Page page;

    public ProductCartPage(Page page) {
        this.page = page;
    }

    public Locator itemsBlock() {
        return page.locator(".inventory_container");
    }
    public Locator removeItem(){
        return page.locator("#remove-sauce-labs-backpack");
    }

    public Locator buyButton(String id) {
        return page.locator("" + id);
    }
}
