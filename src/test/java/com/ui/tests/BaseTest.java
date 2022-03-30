package com.ui.tests;

import com.ui.pages.SeleniumAutomationPracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import webdriver.AbstractWebDriver;
import webdriver.DriverManager;

import static utils.SeleniumProperty.BROWSER_NAME;

public class BaseTest extends AbstractWebDriver {
    protected static WebDriver driver;
    protected SeleniumAutomationPracticeFormPage seleniumAutomationPracticeFormPage;

    @BeforeSuite(alwaysRun = true)
    public void setUp(ITestContext context) {
        driver = DriverManager.getDriver(BROWSER_NAME);
        setDriverAndMaximize(driver);
        seleniumAutomationPracticeFormPage = new SeleniumAutomationPracticeFormPage(driver);
    }

    @AfterSuite(alwaysRun = true)
    public void closeDriver() {
        driver.close();
    }
}