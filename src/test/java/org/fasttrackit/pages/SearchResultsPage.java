package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class SearchResultsPage extends PageObject {

    @FindBy(css = ".azera_shop_grid_column_2 h2")
    private WebElementFacade searchedProduct_Beanie;

    @FindBy(css = "[href=\"http://qa4.fasttrackit.org:8008/?product=new-t-shirt\"] h2")
    private WebElementFacade searchedProduct_NewTShirt;

    public void isFirstProductDisplayed(String text){
        searchedProduct_Beanie.shouldContainText(text);
    }
    public void isSecondProductDisplayed(String text){
        searchedProduct_NewTShirt.shouldContainText(text);
    }




    }



