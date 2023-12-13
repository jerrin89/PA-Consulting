package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static pageactions.ProductListingPageActions.*;

public class ProductListingPageStepDef {

    @And("I select a product and click on add to cart button")
    public void iSelectAProductAndClickOnAddToCartButton() {
        clickOnAddToCartButton();
    }
    @When("I click on the shopping cart")
    public void iClickOnTheShoppingCart() {
        clickOnTheShoppingCartButton();
    }
}
