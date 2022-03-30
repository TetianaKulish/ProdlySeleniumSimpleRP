package webdriver;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static utils.SeleniumProperty.IMPLICITLY_WAIT;
import static utils.SeleniumProperty.PAGE_LOAD_TIMEOUT;


public abstract class AbstractWebDriver {
    protected static WebDriver driver;

    public AbstractWebDriver() {
    }

    public WebDriver setDriverAndMaximize(WebDriver driver) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        return driver;
    }
}