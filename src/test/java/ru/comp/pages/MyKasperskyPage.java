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

    /**
     * Get Sign In button
     * @return
     */
    public WebElement getSignInButton(){
        return driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]"));
    }

    /**
     * Get email input
     * @return
     */
    public WebElement getSignInEmailField(){
        return driver.findElement(By.name("EMail"));
    }

    /**
     * Get pass input
     * @return
     */
    public WebElement getSignInPasswordField(){
        return driver.findElement(By.cssSelector("[data-at-selector='passwordInput']"));
    }

    /**
     * Get submit input
     * @return
     */
    public WebElement getSignInSubmitButton(){
        return driver.findElement(By.cssSelector("[data-at-selector='welcomeSignInBtn']"));
    }

    /**
     * Get validation message
     * @return
     */
    public WebElement getSignInCriticalInvalidEmailOrPassword() {
        return driver.findElement(By.xpath("//p[contains(text(), 'Invalid email address or password')]"));
    }
}
