package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;

public class MainPage {

    private Page page;

    public MainPage(Page page) {
        this.page = page;
    }

    public Locator itemsBlock() {
        return page.locator(".inventory_container");
    }

    public Locator buyButton(String id) {
        return page.locator("" + id);
    }
}
