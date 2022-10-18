package com.wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".mw-search-results li")
    public List<WebElement> searchResults;

    public void verifyAmongSearchResults(String text) {
        for (WebElement item : searchResults) {
            String[] arrOfStr = text.split(" ");
            assertTrue(item.getText().contains(text) || item.getText().contains(arrOfStr[0]) || item.getText().contains(arrOfStr[1]));
        }
    }

    public void verifyFileTypeAmongSearchResults(String type) {
        for (WebElement item : searchResults) {
            assertTrue(item.getText().contains(type));
        }
    }
}
