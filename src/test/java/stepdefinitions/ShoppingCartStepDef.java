package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pageactions.ShoppingCartActions.*;
import static pageactions.checkOutOverviewPageActions.*;

public class ShoppingCartStepDef {

    @Then("I should see the selected item on the basket")
    public void iShouldSeeTheSelectedItemOnTheBasket() {
        verifyTheItemDetails();
    }


    @Then("I navigated to the shopping cart")
    public void iNavigatedToTheShoppingCart() {
        verifyUserIsOnShoppingCart();
    }

    @When("I click checkout button on the shopping cart")
    public void iClickCheckoutButtonOnTheShoppingCart() {
        clickOnCheckOutButton();
    }

    @And("I fill the user information and click continue")
    public void iFillTheUserInformation(DataTable dataTable) {
        iFillTheDetailsAnClickContinue(dataTable);
    }

    @Then("I navigated to the checkout overview")
    public void iNavigatedToTheCheckoutOverview() {
        verifyUserIsOnCheckOutOverView();
        verifyTheItemDetails();
    }

    @And("I click finish button on the checkout overview")
    public void iClickFinishButtonOnTheCheckoutOverview() {
        clickOnTheFinishButton();
    }

    @Then("I get {string} response")
    public void iGetThankYouForYourOrderResponse(String expectedMessage) {
        verifyThePageResponse(expectedMessage);
    }
}
