package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Header {

    private final Page page;

    public Header(Page page) {
        this.page = page;
    }

    public Locator quantityGoodsBasket(){
        return page.locator(".shopping_cart_badge");
    }
}
