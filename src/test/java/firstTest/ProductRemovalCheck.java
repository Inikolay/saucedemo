package firstTest;

import io.qameta.allure.Description;
import logic.HeaderLogic;
import logic.LoginPageLogic;
import logic.MainPageLogic;
import logic.ProductCartPageLogic;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.TestConfig.*;

public class ProductRemovalCheck extends BasePlaywrightTest {

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
    @Description("Check product removal test")
    public void testCheckProductRemovalTest() {
        page.navigate(URL);
        MainPageLogic mainPage = loginPageLogic.enterUsername(USER_NAME)
                .enterUserPasswordInput(PASSWORD)
                .clickLoginButtonGoToMainPage();
        productCartPageLogic.addItemBackpackToCard();
        headerLogic.checkIsVisibleQuantityGoodsBasket();
        productCartPageLogic.clickButtonRemove();
        headerLogic.checkIsNotVisibleQuantityGoodsBasket();
        productCartPageLogic.addItemBackpackToCard()
                .checkIsNotVisibleItemBlocks();
    }
}
