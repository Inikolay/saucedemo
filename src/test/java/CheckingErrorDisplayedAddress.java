import jdk.jfr.Description;
import logic.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.TestConfig.*;

public class CheckingErrorDisplayedAddress extends BaseTest {

    private LoginPageLogic loginPageLogic;
    private HeaderLogic headerLogic;
    private AddressPageLogic addressPageLogic;
    private ProductCartPageLogic productCartPageLogic;

    @BeforeMethod
    public void initPageLogic() {
        loginPageLogic = new LoginPageLogic(page);
        headerLogic = new HeaderLogic(page);
        addressPageLogic = new AddressPageLogic(page);
        productCartPageLogic = new ProductCartPageLogic(page);
    }

    @Test
    @Description("Checking if an error is displayed on the address page")
    public void testCheckingIfAnErrorIsDisplayedOnTheAddressPage() {
        page.navigate(URL);
        MainPageLogic mainPage = loginPageLogic.enterUsername(USER_NAME)
                .enterUserPasswordInput(PASSWORD)
                .clickLoginButtonGoToMainPage();
        productCartPageLogic.addItemBackpackToCard();
        headerLogic.checkIsVisibleQuantityGoodsBasket()
                .clickButtonCart()
                .checkIsVisibleItemInTheCart()
                .clickButtonCheckout()
                .clickButtonContinue();
        addressPageLogic.isVisibleErrorMessageContainerError();
    }
}
