package logic;

import com.microsoft.playwright.Page;
import pages.Header;

public class HeaderLogic {

    private final Header header;

    public HeaderLogic(Page page) {
        this.header = new Header(page);
    }

    public String getQuantityGoodsBasket() {
        return header.quantityGoodsBasket().textContent();
    }

    public HeaderLogic checkIsVisibleQuantityGoodsBasket(){
        if (!header.quantityGoodsBasket().isVisible()) {
            throw new AssertionError("Quantity goods basket should be visible");
        }
        return this;
    }

    public HeaderLogic checkIsNotVisibleQuantityGoodsBasket(){
        header.quantityGoodsBasket().isDisabled();
        return this;
    }
}
