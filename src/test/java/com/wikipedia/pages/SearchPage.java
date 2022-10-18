package com.wikipedia.pages;

import com.wikipedia.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static com.wikipedia.utilities.Utils.clickElement;
import static com.wikipedia.utilities.Utils.setTextToElement;

public class SearchPage extends BasePage {

    @FindBy(css = "#searchText > input")
    public WebElement searchInput;

    @FindBy(css = "button.oo-ui-buttonElement-button")
    public WebElement searchButton;

    @FindBy(css = "div.mw-advancedSearch-searchPreview")
    public WebElement advancedSearchContainer;

    @FindBy(css = "#advancedSearchField-filetype")
    public WebElement fileTypeSelectBox;

    @FindBy(xpath = "//span[text()='svg']")
    public WebElement fileTypeSpan;

    public void setSearchInput(String text) {
        setTextToElement(searchInput, text);
    }

    public void clickSearchButton() {
        clickElement(searchButton);
    }

    public void setFileType(String type) {
        clickElement(advancedSearchContainer);
        clickElement(fileTypeSelectBox);
        Driver.get().findElement(By.xpath(String.format("//span[text()='%s']", type))).click();
    }
}
