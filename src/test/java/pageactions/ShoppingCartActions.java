package pageactions;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import util.BaseClass;
import util.StorageUtils;

import java.util.List;

import static pageactions.ProductListingPageActions.BOLT_T_SHIRT_PRICE;
import static pageactions.ProductListingPageActions.PRODUCT_NAME;

public class ShoppingCartActions extends BaseClass {

    public static final By checkOutButtonLocator = By.id("checkout");
    public static final By continueButtonLocator = By.id("continue");

    public static void verifyTheItemDetails() {
        String actualProductName = driver.findElement(By.xpath("//*[@class='cart_item']//a//div")).getText();
        String actualProductPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        Assert.assertEquals(StorageUtils.get(PRODUCT_NAME), actualProductName);
        Assert.assertEquals(StorageUtils.get(BOLT_T_SHIRT_PRICE), actualProductPrice);
    }

    public static void verifyUserIsOnShoppingCart() {
        driver.findElement(By.xpath("//*[@id='header_container']/div/span[contains(text(), 'Your Cart')]"));
    }

    public static void clickOnCheckOutButton() {
      interactionsUtils.clickOn(checkOutButtonLocator);
    }

    public static void iFillTheDetailsAnClickContinue(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String firstName = data.get(1).get(1);
        String lastName = data.get(2).get(1);
        String postalCode = data.get(3).get(1);
        interactionsUtils.sendKeys(By.id(data.get(1).get(0)), firstName);
        interactionsUtils.sendKeys(By.id(data.get(2).get(0)), lastName);
        interactionsUtils.sendKeys(By.id(data.get(3).get(0)), postalCode);
        interactionsUtils.clickOn(continueButtonLocator);
    }
}
