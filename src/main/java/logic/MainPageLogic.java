package logic;

import com.microsoft.playwright.Page;
import pages.MainPage;


public class MainPageLogic {

    private final MainPage mainPage;

    public MainPageLogic(Page page) {
        this.mainPage = new MainPage(page);
    }


}
