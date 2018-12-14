package ru.comp.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.comp.pages.MyKasperskyPage;

public class MyKasperskyPageSteps {
    MyKasperskyPage myKasperskyPage;

    public MyKasperskyPageSteps(WebDriver driver){
        myKasperskyPage = PageFactory.initElements(driver, MyKasperskyPage.class);
    }

    public void signIn(){
        myKasperskyPage.getSignInButton().click();
        myKasperskyPage.getSignInEmailField().sendKeys("test");
        myKasperskyPage.getSignInPasswordField().sendKeys("test");
        myKasperskyPage.getSignInSubmitButton().click();
    }
}
