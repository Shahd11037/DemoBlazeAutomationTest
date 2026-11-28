package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage{

    private By navBarLocator = By.xpath("//div[@id='navbarExample']");
    private By productStoreHeadingLocator = By.xpath("//a[@id='nava']");
    private By phonesCategoryLocator = By.xpath("//div[@id='contcont']//a[2]");
    private By laptopsCategoryLocator = By.xpath("//div[@id='contcont']//a[3]");
    private By monitorsCategoryLocator = By.xpath("//div[@id='contcont']//a[4]");
    private By laptopProductLocator = By.xpath("//a[normalize-space()='Sony vaio i5']");
    private By phoneProductLocator = By.xpath("//a[normalize-space()='Samsung galaxy s6']");
    private By nextBtnLocator = By.xpath("//button[@id='next2']");
    private By macBookMonitorLocator = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");



    //to help assert if the home page is visible
    public boolean isNavBarDisplayed(){
        return isElementDisplayed(navBarLocator);
    }
    public boolean isProductStoreHeadingDisplayed(){
        return isElementDisplayed(productStoreHeadingLocator);
    }

    //to help assert if the categories are displayed
    public boolean isPhonesCategoryDisplayed(){
        return isElementDisplayed(phonesCategoryLocator);
    }
    public boolean isLaptopsCategoryDisplayed(){
        return isElementDisplayed(laptopsCategoryLocator);
    }
    public boolean isMonitorsCategoryDisplayed(){
        return isElementDisplayed(monitorsCategoryLocator);
    }
    //clicking on Phones
    public void clickOnPhonesCategory(){
        scrollToElementJS(nextBtnLocator);
        myClick(phonesCategoryLocator);
    }
    //clicking on Monitors
    public void clickOnMonitorsCategory(){
        scrollToElementJS(nextBtnLocator);
        myClick(monitorsCategoryLocator);
    }
    //clicking on Laptops
    public void clickOnLaptopsCategory(){
        scrollToElementJS(nextBtnLocator);
        myClick(laptopsCategoryLocator);
    }
    //to see if phones or laptops are displayed
    public boolean isPhoneProductDisplayed(){
        scrollToElementJS(nextBtnLocator);
        return !isElementInvisible(phoneProductLocator);
    }
    public boolean isLaptopProductDisplayed(){
        scrollToElementJS(nextBtnLocator);
        return !isElementInvisible(laptopProductLocator);
    }
    public void isMonitorProductDisplayed(){
        scrollToElementJS(macBookMonitorLocator);
        //return isElementDisplayed(macBookMonitorLocator);
    }
    public void clickNextBtn(){
        scrollToElementJS(nextBtnLocator);
        myClick(nextBtnLocator);
    }

    public ProductPage clickOnPhoneProduct(){
        myClick(phoneProductLocator);
        return new ProductPage();
    }





}
