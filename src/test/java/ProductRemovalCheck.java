import logic.HeaderLogic;
import logic.LoginPageLogic;
import logic.MainPageLogic;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductRemovalCheck extends BaseTest{

    private LoginPageLogic loginPageLogic;
    private HeaderLogic headerLogic;
    private String url = "https://www.saucedemo.com";

    @BeforeMethod
    public void initPageLogic() {
        loginPageLogic = new LoginPageLogic(page);
        headerLogic = new HeaderLogic(page);
    }

    @Test
    public void testProductRemovalCheck() {
        page.navigate(url);
        MainPageLogic mainPage = loginPageLogic.enterUsername("standard_user")
                .enterUserPasswordInput("secret_sauce")
                .clickLoginButton()
                .addItemBackpackToCard();
        headerLogic.checkIsVisibleQuantityGoodsBasket();
        mainPage.clickButtonRemove();
        headerLogic.checkIsNotVisibleQuantityGoodsBasket();
        mainPage.addItemBackpackToCard()
                .checkIsNotVisibleItemBlocks();
    }
}
