package com.demoblaze.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        action = new Actions(driver);
    }

//    public BasePage(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        action = new Actions(driver);
//    }

    protected Boolean isElementDisplayed(By locator){
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }
    protected Boolean isElementInvisible(By locator){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        return true;
    }

    protected void myClick(By locator){
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected String getText(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    protected void mySendKeys(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public String getAlertText() {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        return text;
    }



}
