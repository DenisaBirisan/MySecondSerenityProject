package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;

public class CheckoutSteps {

    private CheckoutPage checkoutPage;
    private HomePage homePage;

    @Step
    public void navigateToCheckout(){
        homePage.clickCheckoutLink();
    }

    @Step
    public void setFirstName(String firstName){
        checkoutPage.setFirstName(firstName);
    }
    @Step
    public void setLastName(String lastName){
        checkoutPage.setLastName(lastName);
    }
    @Step
    public void setAddress(String address){
        checkoutPage.setAddress(address);
    }
    @Step
    public void setCity(String city){
        checkoutPage.setCity(city);
    }
    @Step
    public void setPostcode(String postcode){
        checkoutPage.setPostcode(postcode);
    }
    @Step
    public void setPhone(String phone){
        checkoutPage.setPhone(phone);
    }
    @Step
    public void clickPlaceOrderButton(){
        checkoutPage.clickPlaceOrderButton();
    }

    @Step
    public void placeOrder(String firstName,String lastName,String address,String city,String postcode,String phone){
        navigateToCheckout();
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setPostcode(postcode);
        setPhone(phone);
        clickPlaceOrderButton();
    }

    @Step
    public void verifyIfOrderIsReceived(){
        checkoutPage.verifyReceivedOrderMsg();
    }

}
