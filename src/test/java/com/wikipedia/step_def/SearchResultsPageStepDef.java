package com.wikipedia.step_def;

import com.wikipedia.pages.HomePage;
import com.wikipedia.pages.SearchResultsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchResultsPageStepDef {
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Then("verify {string} among search results")
    public void verifyAmongSearchResults(String text) {
        searchResultsPage.verifyAmongSearchResults(text);
    }

    @And("verify {string} file type among search results")
    public void verifyFileTypeAmongSearchResults(String type) {
        searchResultsPage.verifyFileTypeAmongSearchResults(type);
    }
}
