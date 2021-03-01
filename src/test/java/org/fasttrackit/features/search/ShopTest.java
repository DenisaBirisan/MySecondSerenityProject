package org.fasttrackit.features.search;


import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class ShopTest extends BaseTest {

    @Steps
    private ShopSteps shopSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void isShopPageDisplayingProducts(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASSWORD);
        shopSteps.navigateToShopPage();
        shopSteps.areProductsDisplayed("Album");

    }

}
