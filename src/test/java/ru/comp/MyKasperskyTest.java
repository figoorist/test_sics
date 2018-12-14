package ru.comp;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ru.comp.pages.HomePage;
import ru.comp.pages.MyKasperskyPage;
import ru.comp.steps.MyKasperskyPageSteps;

import java.util.ArrayList;

public class MyKasperskyTest extends TestNgTestBase {
    /** Свойство - объект стартовой страницы*/
    private HomePage homepage;

    /** Attribute - My Kaspersky object*/
    private MyKasperskyPage myKasperskyPage;

    @BeforeClass
    @Parameters({"siteUrl"})
    public void initPageObjects(String siteUrl) {
        homepage = PageFactory.initElements(driver, HomePage.class);
        myKasperskyPage = PageFactory.initElements(driver, MyKasperskyPage.class);
        driver.get(siteUrl);
    }

    /**
     * https://my.kaspersky.com/ check
     */
    @Test
    @Parameters({"MyKasperskyTitle"})
    public void testMyKaspersky(String MyKasperskyTitle) {
        homepage.getMyKasperskyLink().click();
        //Get array of tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //Switch to last tab
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        Assert.assertTrue(myKasperskyPage.getTitle().toLowerCase().contains(MyKasperskyTitle.toLowerCase()));
    }

    @Test
    public void testSignIn() {
        MyKasperskyPageSteps myKasperskyPageSteps = new MyKasperskyPageSteps(driver);

        myKasperskyPageSteps.signIn();
        Assert.assertTrue(myKasperskyPage.getSignInCriticalInvalidEmailOrPassword().isDisplayed());
    }
}
