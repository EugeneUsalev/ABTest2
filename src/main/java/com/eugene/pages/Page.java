package com.eugene.pages;

import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class Page {

    public boolean elementIsVisible(By locator) {
        try {
            $(locator).should(exist);
            return true;
        } catch (ElementNotFound e) {
            return false;
        }
    }

    public String getPageTitle(){
        return title();
    }

    protected void waitPageIsLoaded(By locator){
        $(locator).shouldBe(visible);
    }
}
