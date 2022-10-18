package com.wikipedia.step_def;

import com.wikipedia.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageStepDef {
    SearchPage searchPage = new SearchPage();

    @When("search with {string} text")
    public void searchWithText(String text) throws InterruptedException {
        searchPage.setSearchInput(text);
        searchPage.clickSearchButton();
    }

    @And("set filetype to {string}")
    public void setFiletypeTo(String type) {
        searchPage.setFileType(type);
    }
}
