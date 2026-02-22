package firstTest;

import io.qameta.allure.Description;
import logic.HeaderLogic;
import logic.LoginPageLogic;
import logic.MainPageLogic;
import logic.ProductCartPageLogic;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.TestConfig.*;


public class CheckingOrderCreation extends BasePlaywrightTest {

    private LoginPageLogic loginPageLogic;
    private HeaderLogic headerLogic;
    private ProductCartPageLogic productCartPageLogic;

    @BeforeMethod
    public void initPageLogic() {
        loginPageLogic = new LoginPageLogic(page);
        headerLogic = new HeaderLogic(page);
        productCartPageLogic = new ProductCartPageLogic(page);
    }

    @Test
    @Description("Checking order creation")
    public void testCheckingOrderCreation() {
        page.navigate(URL);
        MainPageLogic mainPage = loginPageLogic.enterUsername(USER_NAME)
                .enterUserPasswordInput(PASSWORD)
                .clickLoginButtonGoToMainPage();
        productCartPageLogic.addItemBackpackToCard();
        headerLogic.checkIsVisibleQuantityGoodsBasket()
                .clickButtonCart()
                .checkIsVisibleItemInTheCart()
                .clickButtonCheckout()
                .enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .enterPostalCode(POSTAL_CODE)
                .clickButtonContinue()
                .checkIsVisibleItemBlock()
                .clickButtonFinish()
                .checkIsVisibleImageSuccessOrder()
                .clickButtonBackHome();
        headerLogic.checkIsNotVisibleQuantityGoodsBasket();
    }
}
