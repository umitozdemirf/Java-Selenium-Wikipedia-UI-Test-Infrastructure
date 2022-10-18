package com.wikipedia.pages;

import com.wikipedia.utilities.ConfReader;
import com.wikipedia.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.wikipedia.utilities.Utils.clickElement;

public class HomePage extends BasePage {

    @FindBy(id = "searchButton")
    public WebElement searchButton;

    public void visitHomePage() {
        Driver.get().get((ConfReader.get("url")));
    }

    public void clickSearchButton() {
        clickElement(searchButton);
    }
}
