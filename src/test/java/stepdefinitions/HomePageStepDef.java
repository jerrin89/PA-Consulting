package stepdefinitions;

import io.cucumber.java.en.Given;

import static pageactions.HomePageActions.loginWithValidCredentials;
import static pageactions.ProductListingPageActions.verifyIAmOnProductListingPage;

public class HomePageStepDef {

    @Given("I have logged in and am on the products listing page")
    public void iAmOnTheProductListingPage() {
        loginWithValidCredentials();
        verifyIAmOnProductListingPage();
    }
}
