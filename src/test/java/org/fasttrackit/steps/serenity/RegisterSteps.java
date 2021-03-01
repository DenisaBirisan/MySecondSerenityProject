package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.RegisterPage;

import java.util.Scanner;


public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;

    @Step
    public void navigateToRegister(){
        homePage.open();
        homePage.clickMyAccountLink();

    }
    @Step
    public void setEmail(String email){
        registerPage.setEmailField(email);
    }
    @Step
    public void setPassword(String password){
        registerPage.setPasswordField(password);
    }
    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }
    @Step
    public void register(String email, String password){
        navigateToRegister();
        setEmail(email);
        setPassword(password);
        clickRegisterButton();
    }
    @Step
    public void verifyIfMessageIsDisplayed(String message) {
        accountPage.verifyHelloMessage(message);
    }
}
