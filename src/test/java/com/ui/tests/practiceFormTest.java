package com.ui.tests;

import org.testng.annotations.Test;

import static com.ui.tests.TestData.practiceFormData.practiceFormData;

public class practiceFormTest extends BaseTest {

    @Test(testName = "1", description = "Fill Selenium - Automation Practice Form")
    public void fillSeleniumAutomationPracticeFormTest() {
        seleniumAutomationPracticeFormPage.clickOnConcernButton()
                .fillSeleniumAutomationPracticeForm(practiceFormData());
        driver.switchTo().alert().accept();
    }
}