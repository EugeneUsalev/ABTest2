package com.eugene.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class SearchResultPage extends Page {

    private By searchField = By.cssSelector(".input__control.mini-suggest__input");

    public void waitResultPageIsLoaded(){
        waitPageIsLoaded(searchField);
    }
}
