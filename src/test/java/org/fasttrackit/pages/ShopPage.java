package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

public class ShopPage extends PageObject {

    @FindBy(css = "[href=\"http://qa4.fasttrackit.org:8008/?product=album\"]")
    private WebElementFacade product;

    @FindBy(css = "[href=\"http://qa4.fasttrackit.org:8008/?product=album\"] h2")
    private WebElementFacade productName;


    public void clickProduct(){
        clickOn(product);
    }

    public void areProductsDisplayed(String text){
        productName.shouldContainText(text);
    }


}
