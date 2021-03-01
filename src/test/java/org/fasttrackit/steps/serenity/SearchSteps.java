package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.SearchResultsPage;

public class SearchSteps {

    private AccountPage accountPage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void openSearchField(){
        accountPage.clickSearchIcon();
    }

    @Step
    public void setSearchField(String text){
        accountPage.setSearchField(text);
    }

    @Step
    public void clickSearchButton(){
        accountPage.clickSearchButton();
    }

    @Step
    public void search(String text){
        accountPage.clickSearchIcon();
        accountPage.setSearchField(text);
        accountPage.clickSearchButton();
    }

    @Step
    public void verifyIfFirstProductIsDisplayed(String text){
        searchResultsPage.isFirstProductDisplayed(text);
    }

    public void verifyIfSecondProductIsDisplayed(String text){
        searchResultsPage.isSecondProductDisplayed(text);
    }




}
