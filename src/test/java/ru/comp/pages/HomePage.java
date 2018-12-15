package ru.comp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Home page
 */
public class HomePage extends Page {
    /**
     * Constructor
     * @param webDriver
     */
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

  /**
   * Get MyKasperskyTest link
   * @return
   */
  public WebElement getMyKasperskyLink(){
        return driver.findElement(By.partialLinkText("My Kaspersky"));
    }


}
