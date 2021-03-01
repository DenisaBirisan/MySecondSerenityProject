package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    private HomePage homePage;

    @FindBy(css = ".product-name a")
    private WebElementFacade productNameInCart;
    @FindBy(css="td.product-price")
    private WebElementFacade productPriceInCart;
    @FindBy(css = ".wc-proceed-to-checkout a")
    private WebElementFacade checkoutButton;




    public void navigateToCart(){
        homePage.clickCartLink();
    }

    public void isProductInCart(){
        productNameInCart.shouldContainText("Album");
        productPriceInCart.shouldContainText("15,00 lei");
    }

    public void clickCheckoutButton(){
        clickOn(checkoutButton);
    }






}
