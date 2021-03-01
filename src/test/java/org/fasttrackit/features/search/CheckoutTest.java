package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Steps
    private CheckoutSteps checkoutSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void placeOrderTest(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASSWORD);
        cartSteps.addProductToCart();
        checkoutSteps.placeOrder(EnvironmentConstants.FIRST_NAME,EnvironmentConstants.LAST_NAME,EnvironmentConstants.ADDRESS,
                EnvironmentConstants.CITY,EnvironmentConstants.POSTCODE, EnvironmentConstants.PHONE);
        checkoutSteps.verifyIfOrderIsReceived();
    }
}
