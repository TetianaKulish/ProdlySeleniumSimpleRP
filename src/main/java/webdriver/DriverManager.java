package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

import static utils.SeleniumProperty.BROWSER_NAME;
import static utils.SeleniumProperty.DEFAULT_DOWNLOAD_DIRECTORY;

public class DriverManager {
    protected static Logger log = Logger.getLogger(DriverManager.class);

    public static WebDriver getDriver(String browser) {
        WebDriver driver;
        if (browser == null || browser.isEmpty()) {
            browser = BROWSER_NAME;
        } else if (browser == null || browser.isEmpty()) {
            throw new IllegalStateException("Browser's property is missing.");
        }

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                Map<String, Object> prefs = new HashMap<>();
                prefs.put("download.prompt_for_download", false);
                prefs.put("download.default_directory", DEFAULT_DOWNLOAD_DIRECTORY);
                options.setExperimentalOption("prefs", prefs);
                driver = new ChromeDriver(options);
                return driver;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                return driver;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                return driver;
            default:
                throw new IllegalArgumentException(browser + "The browser is not supported");
        }
    }
}