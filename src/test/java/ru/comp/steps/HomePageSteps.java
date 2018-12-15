package ru.comp.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.comp.pages.HomePage;

import java.util.ArrayList;

public class HomePageSteps {
    /**
    * HomePage object
     */
    private HomePage homepage;
    /**
     * WebDriver
     */
    private WebDriver wd;

    /**
     * Constructor
     * @param driver
     */
    public HomePageSteps(WebDriver driver){
        homepage = PageFactory.initElements(driver, HomePage.class);
        wd = driver;
    }

    /**
     * Click to My Kaspersky step
     */
    public void goToMyKasperskyPageStep() {
        homepage.getMyKasperskyLink().click();
        //Get array of tabs
        ArrayList<String> tabs = new ArrayList<>(wd.getWindowHandles());
        //Switch to last tab
        wd.switchTo().window(tabs.get(tabs.size() - 1));
    }
}
