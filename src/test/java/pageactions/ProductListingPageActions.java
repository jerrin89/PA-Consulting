package pageactions;

import org.junit.Assert;
import org.openqa.selenium.By;
import util.BaseClass;
import util.StorageUtils;

import static contants.FrontendConstants.ProductLists.BOLT_T_SHIRT_PRICE;
import static contants.FrontendConstants.ProductLists.PRODUCT_NAME;

public class ProductListingPageActions extends BaseClass {
    public static final String expectedProductListingURL = "https://www.saucedemo.com/inventory.html";
    public static final By boltTShirtLocator = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    public static final By cartButtonLocator = By.id("shopping_cart_container");

    public static void verifyIAmOnProductListingPage() {
        Assert.assertEquals(expectedProductListingURL, driver.getCurrentUrl());
    }

    public static void clickOnAddToCartButton() {
        StorageUtils.store(BOLT_T_SHIRT_PRICE, "$15.99");
        StorageUtils.store(PRODUCT_NAME, "Sauce Labs Bolt T-Shirt");
        interactionsUtils.clickOn(boltTShirtLocator);
    }

    public static void clickOnTheShoppingCartButton() {
        interactionsUtils.clickOn(cartButtonLocator);
    }
}
