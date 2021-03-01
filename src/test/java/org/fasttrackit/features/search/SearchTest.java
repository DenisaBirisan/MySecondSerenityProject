package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void searchFirstProductTest(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASSWORD);
        searchSteps.search("Beanie");
        searchSteps.verifyIfFirstProductIsDisplayed("Beanie");

    }
    @Test
    public void searchSecondProductTest(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASSWORD);
        searchSteps.search("T-Shirt");
        searchSteps.verifyIfSecondProductIsDisplayed("New T-Shirt");
    }

    @Test
    public void searchProductsTest(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASSWORD);
        searchSteps.search("Beanie");
        searchSteps.verifyIfFirstProductIsDisplayed("Beanie");
        searchSteps.search("T-Shirt");
        searchSteps.verifyIfSecondProductIsDisplayed("New T-Shirt");
    }


}
