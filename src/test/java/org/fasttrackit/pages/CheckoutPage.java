package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {

    @FindBy(id="billing_first_name")
    private WebElementFacade firstNameField;

    @FindBy(id="billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(id="billing_address_1")
    private WebElementFacade addressField;

    @FindBy(id="billing_city")
    private WebElementFacade cityField;

    @FindBy(id="billing_postcode")
    private WebElementFacade postcodeField;

    @FindBy(id="billing_phone")
    private WebElementFacade phoneField;

    @FindBy(id="place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = ".woocommerce-notice--success")
    private WebElementFacade receivedOrderMsg;


    public void setFirstName(String firstName){
        typeInto(firstNameField,firstName);
    }

    public void setLastName(String lastName){
        typeInto(lastNameField,lastName);
    }

    public void setAddress(String address){
        typeInto(addressField,address);
    }

    public void setCity(String city){
        typeInto(cityField,city);
    }

    public void setPostcode(String postcode){
        typeInto(postcodeField,postcode);
    }

    public void setPhone(String phone){
        typeInto(phoneField,phone);
    }

    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }

    public void verifyReceivedOrderMsg(){
        receivedOrderMsg.shouldContainText("Thank you. Your order has been received.");
    }

}
