package com.demoblaze.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    private By productNameLocator = By.xpath("//h2[normalize-space()='Samsung galaxy s6']");

    public String getProductName(){
        return getText(productNameLocator);
    }
}
