package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static util.BaseClass.driver;

public class InteractionsUtils {

    public void sendKeys(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }
    public void clickOn(By locator) {
        driver.findElement(locator).click();
    }

}
