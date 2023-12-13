package pageactions;

import org.junit.Assert;
import org.openqa.selenium.By;
import util.BaseClass;

public class checkOutOverviewPageActions extends BaseClass {
    public static final By finishButton = By.id("finish");
    public static void verifyUserIsOnCheckOutOverView() {
        driver.findElement(By.xpath("//*[@id='header_container']/div/span[contains(text(), 'Checkout: Overview')]"));
    }
    public static void clickOnTheFinishButton() {
        interactionsUtils.clickOn(finishButton);
    }

    public static void verifyThePageResponse(String expectedMessage) {
        String actualMessage = driver.findElement(By.xpath("//*[@id='checkout_complete_container']/h2")).getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}
