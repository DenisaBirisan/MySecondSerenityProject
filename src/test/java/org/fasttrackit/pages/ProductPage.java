package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;


public class ProductPage extends PageObject {

    @FindBy(css = ".product_title")
    private WebElementFacade productTitle;
    @FindBy(css = ".summary p.price")
    private WebElementFacade productPrice;
    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addToCartButton;



    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void isProductTitleDisplayed(String title){
        productTitle.shouldContainText(title);
    }
    public void isProductPriceDisplayed(String price){
        productPrice.shouldContainText(price);
    }








}
