package base;

import com.microsoft.playwright.Page;

public abstract class BaseTest {
    protected final Page page;

    protected BaseTest(Page page) {
        this.page = page;
    }

    protected void waitForVisible(String selector) {
        page.waitForSelector(selector);
    }
}
