package logic;

import com.microsoft.playwright.Page;
import pages.BasketPage;


public class BasketPageLogic {

    private final BasketPage basketPage;

    public BasketPageLogic(Page page) {
        this.basketPage = new BasketPage(page);
    }

    public BasketPageLogic checkIsVisibleItemInTheCart(){
        basketPage.itemCart().isVisible();
        return this;
    }

    public AddressPageLogic clickButtonCheckout(){
        basketPage.buttonCheckout().click();
        return new AddressPageLogic(basketPage.buttonCheckout().page());
    }

    public BasketPageLogic clickButtonRemoveItem(){
        basketPage.buttonRemove().click();
        basketPage.itemCart().isDisabled();
        return this;
    }

    public String getPriceProductBasketPage(){
        return basketPage.priceProductBasketPage().innerText();
    }
}
