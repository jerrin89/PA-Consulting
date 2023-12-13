package pageactions;

import org.openqa.selenium.By;
import util.BaseClass;

public class HomePageActions extends BaseClass{
    public static final String BASEURL = "https://www.saucedemo.com/";
    public static final By usernameLocator = By.id("user-name");
    public static final By passwordLocator = By.id("password");
    public static final By loginButton = By.id("login-button");

    public static void loginWithValidCredentials() {
        navigateToBaseUrl();
        interactionsUtils.sendKeys(usernameLocator, "standard_user");
        interactionsUtils.sendKeys(passwordLocator, "secret_sauce");
        interactionsUtils.clickOn(loginButton);
    }

    private static void navigateToBaseUrl() {
        driver.navigate().to(BASEURL);
    }

}
