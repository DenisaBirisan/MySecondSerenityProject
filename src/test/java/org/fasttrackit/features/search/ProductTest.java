package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.ProductSteps;
import org.fasttrackit.steps.serenity.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Steps
    private ProductSteps productSteps;
    @Steps
    private ShopSteps shopSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void areProductDetailsDisplayed(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASSWORD);
        productSteps.navigateToProduct();
        productSteps.areProductEssentialDetailsDisplayed("ALBUM", "15,00 lei");
    }
}
