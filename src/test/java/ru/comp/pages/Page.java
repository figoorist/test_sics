package ru.comp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

    protected WebDriver driver;

    /**
     * Constructor injecting the WebDriver interface
     * @param webDriver
     */
    public Page(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Get title
     * @return
     */
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * Get element h1
     */
    @FindBy(how = How.TAG_NAME, using = "h1")
    @CacheLookup
    public WebElement header;
}
