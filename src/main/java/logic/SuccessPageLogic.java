package logic;

import com.microsoft.playwright.Page;
import pages.SuccessPage;

public class SuccessPageLogic {

    private final SuccessPage successPage;

    public SuccessPageLogic(Page page) {
        this.successPage = new SuccessPage(page);
    }

    public SuccessPageLogic checkIsVisibleImageSuccessOrder(){
         successPage.imageSuccessOrder().isVisible();
         return this;
    }

    public MainPageLogic clickButtonBackHome(){
        successPage.buttonBackHome().click();
        return new MainPageLogic(successPage.buttonBackHome().page());
    }
}
