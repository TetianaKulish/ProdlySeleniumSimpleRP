package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {
    private final static Logger log = Logger.getLogger(Waiters.class);

    public static void waitUntilElementIsInvisible(By webElement, WebDriver webDriver, int timeOutInSeconds) {
        new WebDriverWait(webDriver, timeOutInSeconds).until(ExpectedConditions.invisibilityOfElementLocated(webElement));
    }

    public static void waitUntilElementToBeClickable(By element, WebDriver webDriver, int timeOutInSeconds) {
        log.info(String.format("%s %s %s sec", "waitUntilElementToBeClickable()", element.toString(), timeOutInSeconds));
        new WebDriverWait(webDriver, timeOutInSeconds).until(ExpectedConditions.elementToBeClickable(element));
    }
}