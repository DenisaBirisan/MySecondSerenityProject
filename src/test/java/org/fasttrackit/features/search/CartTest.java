package org.fasttrackit.features.search;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;

    @Test
    public void isProductDisplayedInCart(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASSWORD);
        cartSteps.addProductToCart();
        cartSteps.verifyIfProductIsInCart();
    }
}
