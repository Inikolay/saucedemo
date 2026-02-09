package logic;

import com.microsoft.playwright.Page;
import pages.MainPage;


public class MainPageLogic {

    private final MainPage mainPage;

    public MainPageLogic(Page page) {
        this.mainPage = new MainPage(page);
    }

    public MainPageLogic checkIsVisibleCodeblocks() {
        if (!mainPage.itemsBlock().isVisible()) {
            throw new AssertionError("Items block should be visible");
        }
        return this;
    }

    public MainPageLogic addItemBackpackToCard(){
        mainPage.buyButton("#add-to-cart-sauce-labs-backpack").click();
        return this;
    }

}
