package logic;

import com.microsoft.playwright.Page;
import pages.HeaderPage;

public class HeaderLogic {

    private final HeaderPage headerPage;

    public HeaderLogic(Page page) {
        this.headerPage = new HeaderPage(page);
    }

    public String getQuantityGoodsBasket() {
        return headerPage.quantityGoodsBasket().textContent();
    }

    public HeaderLogic checkIsVisibleQuantityGoodsBasket(){
        if (!headerPage.quantityGoodsBasket().isVisible()) {
            throw new AssertionError("Quantity goods basket should be visible");
        }
        return this;
    }

    public HeaderLogic checkIsNotVisibleQuantityGoodsBasket(){
        headerPage.quantityGoodsBasket().isHidden();
        return this;
    }

    public CartPageLogic clickButtonCart(){
        headerPage.buttonCart().click();
        return new CartPageLogic(headerPage.buttonCart().page());
    }

    public HeaderLogic checkIsVisibleProductsText(){
        headerPage.productsText().isVisible();
        return this;
    }
}
