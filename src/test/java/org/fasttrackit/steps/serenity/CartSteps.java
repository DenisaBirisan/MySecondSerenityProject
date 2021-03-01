package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;

import org.fasttrackit.pages.*;

public class CartSteps {

    private LoginPage loginPage;
    private HomePage homePage;
    private ShopPage shopPage;
    private ProductPage productPage;
    private CartPage cartPage;



    @Step
    public void navigateToCart(){
        cartPage.navigateToCart();
    }

    @Step
    public void addProductToCart(){
        homePage.clickShopLink();
        shopPage.clickProduct();
        productPage.clickAddToCartButton();
        cartPage.navigateToCart();
    }

    @Step
    public void verifyIfProductIsInCart(){
        cartPage.isProductInCart();
    }


}
