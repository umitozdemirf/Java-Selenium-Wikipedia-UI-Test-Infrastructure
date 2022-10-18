package com.wikipedia.step_def;

import com.wikipedia.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageStepDef {
    HomePage homePage = new HomePage();

    @Given("visit homepage")
    public void visitHomePage() throws InterruptedException {
        homePage.visitHomePage();
    }

    @And("click search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

}
