package logic;

import com.microsoft.playwright.Page;
import pages.ProductCartPage;

public class ProductCartPageLogic {

    private final ProductCartPage productCartPage;

    public ProductCartPageLogic(Page page) {
        this.productCartPage = new ProductCartPage(page);
    }

    public ProductCartPageLogic checkIsVisibleItemBlocks() {
        if (!productCartPage.itemsBlock().isVisible()) {
            throw new AssertionError("Items block should be visible");
        }
        return this;
    }

    public ProductCartPageLogic checkIsNotVisibleItemBlocks() {
        productCartPage.itemsBlock().isHidden();
        return this;
    }

    public ProductCartPageLogic addItemBackpackToCard() {
        productCartPage.buyButton("#add-to-cart-sauce-labs-backpack").click();
        return this;
    }

    public ProductCartPageLogic clickButtonRemove() {
        productCartPage.removeItem().click();
        return this;
    }

    public String getPriceProductCartPage() {
        return productCartPage.priceProductCartPage().innerText();
    }
}
