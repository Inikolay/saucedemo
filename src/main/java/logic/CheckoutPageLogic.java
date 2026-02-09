package logic;

import com.microsoft.playwright.Page;
import pages.CheckoutPage;

public class CheckoutPageLogic {

    private final CheckoutPage checkoutPage;

    public CheckoutPageLogic(Page page) {
        this.checkoutPage = new CheckoutPage(page);
    }

    public CheckoutPageLogic checkIsVisibleItemBlock() {
        checkoutPage.itemBlock().isVisible();
        return this;
    }

    public SuccessPageLogic clickButtonFinish(){
        checkoutPage.buttonFinish().click();
        return new SuccessPageLogic(checkoutPage.buttonFinish().page());
    }
}
