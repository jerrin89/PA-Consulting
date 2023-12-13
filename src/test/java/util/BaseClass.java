package util;

import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver = Driver.getDriver();
    public static InteractionsUtils interactionsUtils = new InteractionsUtils();
    public static StorageUtils storageUtils = new StorageUtils();
}
