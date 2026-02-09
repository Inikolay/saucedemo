package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HeaderPage {

    private final Page page;

    public HeaderPage(Page page) {
        this.page = page;
    }

    public Locator quantityGoodsBasket(){
        return page.locator(".shopping_cart_badge");
    }

    public Locator buttonCart(){
        return page.locator("a.shopping_cart_link");
    }

    public Locator productsText(){
        return page.locator("span.title");
    }
}
