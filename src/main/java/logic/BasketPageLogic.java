package logic;

import com.microsoft.playwright.Page;
import pages.BasketPage;


public class BasketPageLogic {

    private final BasketPage cartPage;

    public BasketPageLogic(Page page) {
        this.cartPage = new BasketPage(page);
    }

    public BasketPageLogic checkIsVisibleItemInTheCart(){
        cartPage.itemCart().isVisible();
        return this;
    }

    public AddressPageLogic clickButtonCheckout(){
        cartPage.buttonCheckout().click();
        return new AddressPageLogic(cartPage.buttonCheckout().page());
    }

    public BasketPageLogic clickButtonRemoveItem(){
        cartPage.buttonRemove().click();
        cartPage.itemCart().isDisabled();
        return this;
    }
}
