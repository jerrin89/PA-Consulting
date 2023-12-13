package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver(BrowserType browserType) {
        return driverThreadLocal.get() == null ? initializeDriver(browserType) : driverThreadLocal.get();
    }

    public static WebDriver getDriver() {
        return getDriver(BrowserType.CHROME);
    }

    private static WebDriver initializeDriver(BrowserType browserType) {
        WebDriverManager manager = browserType == BrowserType.CHROME ? WebDriverManager.chromedriver() : WebDriverManager.firefoxdriver();
        manager.setup();

        WebDriver driver = browserType == BrowserType.CHROME ? new ChromeDriver() : new FirefoxDriver(new FirefoxOptions());

        // Maximize the browser window
        driver.manage().window().maximize();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> driver.quit(), "Driver shutdown thread"));

        driverThreadLocal.set(driver);
        return driver;
    }

    public enum BrowserType {
        CHROME, FIREFOX
    }
}
