package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions action;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        action = new Actions(driver);
    }

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



}
