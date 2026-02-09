package logic;

import com.microsoft.playwright.Page;
import pages.AddressPage;

public class AddressPageLogic {

    private final AddressPage addressPage;

    public AddressPageLogic(Page page) {
        this.addressPage = new AddressPage(page);
    }

    public AddressPageLogic enterFirstName(String firstName){
        addressPage.firstNameInput().fill(firstName);
        return this;
    }

    public AddressPageLogic enterLastName(String lastName){
        addressPage.lastNameInput().fill(lastName);
        return this;
    }

    public AddressPageLogic enterPostalCode(String postalCode){
        addressPage.postalCodeInput().fill(postalCode);
        return this;
    }

    public AddressPageLogic isVisibleErrorMessageContainerError(){
        addressPage.errorMessageContainerError().isVisible();
        return this;
    }

    public CheckoutPageLogic clickButtonContinue(){
        addressPage.buttonContinue().click();
        return new CheckoutPageLogic(addressPage.buttonContinue().page());
    }

}
