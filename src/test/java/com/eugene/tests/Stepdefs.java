package com.eugene.tests;

import com.eugene.pages.SearchResultPage;
import com.eugene.pages.StartPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import static com.codeborne.selenide.Selenide.open;
import static com.eugene.Config.*;
import static com.eugene.ScreenMaker.makeScreenshot;

public class Stepdefs {
    protected StartPage startPage;
    protected SearchResultPage searchResultPage;
    @Before
    public void init(){
        startPage = open(START_URL, StartPage.class);
    }

    @Given("I open start page")
    public void iOpenStartPage() {
        startPage.waitStartPageIsLoaded();
    }

    @When("i search {string}")
    public void iSearch(String query) {
        searchResultPage = startPage.search(query);
    }

    @Then("i get to the {string} page")
    public void iGetToThePage(String expectedTitle) {
        searchResultPage.waitResultPageIsLoaded();
        Assert.assertTrue(searchResultPage.getPageTitle().contains(expectedTitle));
    }

    @After()
    public void takeScreenShot(Scenario scenario){
        if(scenario.isFailed()) {
            makeScreenshot(SCREENSHOTS_DIR_PATH);
        }
    }
}
