package com.wikipedia.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Set;

public class Utils {

    public static void clickElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), Integer.parseInt(ConfReader.get("wait_time")));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void setTextToElement(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), Integer.parseInt(ConfReader.get("wait_time")));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
    }
}
