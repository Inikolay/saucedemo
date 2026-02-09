package logic;

import com.microsoft.playwright.Page;
import pages.CartPage;


public class CartPageLogic {

    private final CartPage cartPage;

    public CartPageLogic(Page page) {
        this.cartPage = new CartPage(page);
    }

    public CartPageLogic checkIsVisibleItemInTheCart(){
        cartPage.itemCart().isVisible();
        return this;
    }

    public AddressPageLogic clickButtonCheckout(){
        cartPage.buttonCheckout().click();
        return new AddressPageLogic(cartPage.buttonCheckout().page());
    }

    public CartPageLogic clickButtonRemoveItem(){
        cartPage.buttonRemove().click();
        cartPage.itemCart().isDisabled();
        return this;
    }
}
