package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validCredentialsLoginTest(){
        loginSteps.navigateToLogin();
        loginSteps.setEmail(EnvironmentConstants.USER_EMAIL);
        loginSteps.setPassword(EnvironmentConstants.USER_PASSWORD);
        loginSteps.clickLoginButton();
        loginSteps.verifyAccountMessage("denisatest");

//        loginSteps.login("cosmin@fasttrackit.org","123456");
    }

}
