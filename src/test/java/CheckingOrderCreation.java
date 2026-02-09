import logic.HeaderLogic;
import logic.LoginPageLogic;
import logic.MainPageLogic;
import logic.ProductCartPageLogic;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CheckingOrderCreation extends BaseTest {

    private LoginPageLogic loginPageLogic;
    private HeaderLogic headerLogic;
    private ProductCartPageLogic productCartPageLogic;
    private String url = "https://www.saucedemo.com";

    @BeforeMethod
    public void initPageLogic() {
        loginPageLogic = new LoginPageLogic(page);
        headerLogic = new HeaderLogic(page);
        productCartPageLogic = new ProductCartPageLogic(page);
    }

    @Test
    public void testLoginPositive() {
        page.navigate(url);
        MainPageLogic mainPage = loginPageLogic.enterUsername("standard_user")
                .enterUserPasswordInput("secret_sauce")
                .clickLoginButton();
        productCartPageLogic.addItemBackpackToCard();
        headerLogic.checkIsVisibleQuantityGoodsBasket()
                .clickButtonCart()
                .checkIsVisibleItemInTheCart()
                .clickButtonCheckout()
                .enterFirstName("Nikolay")
                .enterLastName("Test")
                .enterPostalCode("66059")
                .clickButtonContinue()
                .checkIsVisibleItemBlock()
                .clickButtonFinish()
                .checkIsVisibleImageSuccessOrder()
                .clickButtonBackHome();
        headerLogic.checkIsNotVisibleQuantityGoodsBasket();
    }
}
