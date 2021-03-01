package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ShopPage;

public class ShopSteps {

    private ShopPage shopPage;
    private HomePage homePage;

    @Step
    public void clickOnProduct(){
        shopPage.clickProduct();
    }


    @Step
    public void navigateToShopPage(){
        homePage.open();
        homePage.clickShopLink();
    }

    @Step
    public void areProductsDisplayed(String text){
        shopPage.areProductsDisplayed(text);

    }


}
