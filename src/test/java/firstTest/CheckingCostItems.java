package firstTest;

import io.qameta.allure.Description;
import logic.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static base.TestConfig.*;

public class CheckingCostItems extends BasePlaywrightTest {

    private LoginPageLogic loginPageLogic;
    private HeaderLogic headerLogic;
    private ProductCartPageLogic productCartPageLogic;
    private BasketPageLogic basketPageLogic;
    private AddressPageLogic addressPageLogic;
    private CheckoutPageLogic checkoutPageLogic;
    private String priceFromProductCartPageLogic, priceFromProductBasketPage, priceFromCheckoutPage;

    @BeforeMethod
    public void initPageLogic() {
        loginPageLogic = new LoginPageLogic(page);
        headerLogic = new HeaderLogic(page);
        productCartPageLogic = new ProductCartPageLogic(page);
        basketPageLogic = new BasketPageLogic(page);
        addressPageLogic = new AddressPageLogic(page);
        checkoutPageLogic = new CheckoutPageLogic(page);
    }

    @Test
    @Description("Checking the cost of items")
    public void testCheckingCostItems() {
        page.navigate(URL);
        MainPageLogic mainPage = loginPageLogic.enterUsername(USER_NAME)
                .enterUserPasswordInput(PASSWORD)
                .clickLoginButtonGoToMainPage();
        priceFromProductCartPageLogic = productCartPageLogic.getPriceProductCartPage();
        productCartPageLogic.addItemBackpackToCard();
        headerLogic.checkIsVisibleQuantityGoodsBasket()
                .clickButtonCart();
        priceFromProductBasketPage = basketPageLogic.getPriceProductBasketPage();
        basketPageLogic.clickButtonCheckout();
        Assert.assertEquals(priceFromProductCartPageLogic, priceFromProductBasketPage, "Incorrect price");
        addressPageLogic.enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .enterPostalCode(POSTAL_CODE)
                .clickButtonContinue();
        priceFromCheckoutPage = checkoutPageLogic.getPriceProductCheckoutPage();
        Assert.assertEquals(priceFromProductCartPageLogic, priceFromCheckoutPage, "Incorrect price");
    }
}
