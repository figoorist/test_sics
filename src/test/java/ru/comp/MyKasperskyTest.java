package ru.comp;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.comp.pages.HomePage;
import ru.comp.pages.MyKasperskyPage;
import ru.comp.steps.HomePageSteps;
import ru.comp.steps.MyKasperskyPageSteps;

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
        HomePageSteps homePageSteps = new HomePageSteps(driver);

        homePageSteps.goToMyKasperskyPageStep();
        Assert.assertTrue(myKasperskyPage.getTitle().toLowerCase().contains(MyKasperskyTitle.toLowerCase()));
    }

    /**
     * Sign In failed check
     */
    @Test
    public void testSignIn() {
        MyKasperskyPageSteps myKasperskyPageSteps = new MyKasperskyPageSteps(driver);

        myKasperskyPageSteps.signInStep();
        Assert.assertTrue(myKasperskyPage.getSignInCriticalInvalidEmailOrPassword().isDisplayed());
    }
}
