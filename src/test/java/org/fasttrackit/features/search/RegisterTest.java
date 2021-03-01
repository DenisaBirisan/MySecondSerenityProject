package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;



public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void validCredentialsRegisterTest() {
        registerSteps.navigateToRegister();
        registerSteps.setEmail("*insert new e-mail address*");
        registerSteps.setPassword("*insert new strong password*");
        registerSteps.clickRegisterButton();
        registerSteps.verifyIfMessageIsDisplayed("*insert new username*");
    }
}