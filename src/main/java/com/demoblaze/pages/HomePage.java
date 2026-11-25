package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By navBarLocator = By.xpath("//div[@id='navbarExample']");
    private By productStoreHeadingLocator = By.xpath("//a[@id='nava']");
    private By phonesCategoryLocator = By.xpath("//div[@id='contcont']//a[2]");
    private By laptopsCategoryLocator = By.xpath("//div[@id='contcont']//a[3]");
    private By monitorsCategoryLocator = By.xpath("//div[@id='contcont']//a[4]");
    private By laptopProductLocator = By.xpath("//a[normalize-space()='Sony vaio i5']");
    private By phoneProductLocator = By.xpath("//a[normalize-space()='Samsung galaxy s6']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

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
        myClick(phonesCategoryLocator);
    }
    //clicking on Monitors
    public void clickOnMonitorsCategory(){
        myClick(monitorsCategoryLocator);
    }
    //clicking on Laptops
    public void clickOnLaptopsCategory(){
        myClick(laptopsCategoryLocator);
    }
    //to see if phones or laptops are displayed
    public boolean isPhoneProductDisplayed(){
        return !isElementInvisible(phoneProductLocator);
    }
    public boolean isLaptopProductDisplayed(){
        return !isElementInvisible(laptopProductLocator);
    }





}
