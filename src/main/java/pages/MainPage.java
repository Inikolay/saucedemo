package pages;

import com.microsoft.playwright.Page;
import jdk.internal.org.xml.sax.Locator;

public class MainPage {

    Page page;

    private final String itemsBlock = "#inventory_container";

    public Locator buyButton(String id) {
        return (Locator) page.locator("#" + id);
    }
}
