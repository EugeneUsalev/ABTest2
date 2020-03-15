package com.eugene.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class StartPage extends Page {

    private By searchField = By.cssSelector(".input__control.input__input");
    private By sendButton = By.cssSelector(".search2__button");

    public SearchResultPage search(String query){
        $(searchField).setValue(query);
        $(sendButton).click();
        return page(SearchResultPage.class);
    }

    public void waitStartPageIsLoaded(){
        waitPageIsLoaded(searchField);
    }
}
