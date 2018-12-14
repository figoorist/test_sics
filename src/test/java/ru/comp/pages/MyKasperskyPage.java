package ru.comp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyKasperskyPage extends Page {
    /**
     * Constructor
     * @param webDriver
     */
    public MyKasperskyPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getSignInButton(){
        return driver.findElement(By.cssSelector("button.js-signin-button"));
    }

    public WebElement getSignInEmailField(){
        return driver.findElement(By.name("EMail"));
    }

    public WebElement getSignInPasswordField(){
        return driver.findElement(By.name("Password"));
    }

    public WebElement getSignInSubmitButton(){
        return driver.findElement(By.cssSelector("[data-at-selector='welcomeSignInBtn']"));
    }

    public WebElement getSignInCriticalInvalidEmailOrPassword() {
        return driver.findElement(By.partialLinkText("Invalid email address or password"));
    }
}