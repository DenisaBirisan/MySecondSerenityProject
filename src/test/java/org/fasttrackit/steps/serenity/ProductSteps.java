package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.ShopPage;

public class ProductSteps {

    private HomePage homePage;
    private ShopPage shopPage;
    private ProductPage productPage;

    @Step
    public void navigateToProduct(){
        homePage.open();
        homePage.clickShopLink();
        shopPage.clickProduct();
    }

    @Step
    public void isProductNameDisplayed(String title){
        productPage.isProductPriceDisplayed(title);
    }
    @Step
    public void isProductPriceDisplayed(String price){
        productPage.isProductPriceDisplayed(price);
    }

    @Step
    public void areProductEssentialDetailsDisplayed(String title, String price){
        productPage.isProductTitleDisplayed(title);
        productPage.isProductPriceDisplayed(price);
    }

}
