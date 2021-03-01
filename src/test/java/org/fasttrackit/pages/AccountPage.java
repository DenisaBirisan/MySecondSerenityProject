package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class AccountPage extends PageObject {

    @FindBy(css = ".woocommerce-MyAccount-content p strong:first-child")
    private WebElementFacade helloMsg;

    @FindBy(css = ".fa-search")
    private WebElementFacade searchIcon;
    @FindBy(css = ".search-field")
    private WebElementFacade searchField;
    @FindBy(css = "[type=submit]")
    private WebElementFacade searchButton;


    public void verifyHelloMessage(String userName){
        helloMsg.shouldContainText(userName);
        }
    public void clickSearchIcon(){
        clickOn(searchIcon);
    }
    public void setSearchField(String text){
        typeInto(searchField,text);
    }
    public void clickSearchButton(){
        clickOn(searchButton);
    }





}
