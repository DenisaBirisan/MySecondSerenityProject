package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = ".menu-item-122")
    private WebElementFacade myAccountLink;
    @FindBy(css = ".menu-item-123")
    private WebElementFacade shopLink;
    @FindBy(css=".menu-item-124")
    private WebElementFacade cartLink;
    @FindBy(css=".menu-item-125")
    private WebElementFacade checkoutLink;



    public void clickMyAccountLink(){
        clickOn(myAccountLink);
    }

    public void clickShopLink(){ clickOn(shopLink); }

    public void clickCartLink(){
        clickOn(cartLink);
    }

    public void clickCheckoutLink(){
        clickOn(checkoutLink);
    }   





}
