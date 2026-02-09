package base;

import com.microsoft.playwright.Page;

public class CommonMethods {
    
    private static Page page;

    public Object open(String url) {
        page.navigate(url);
        return this;
    }
}
