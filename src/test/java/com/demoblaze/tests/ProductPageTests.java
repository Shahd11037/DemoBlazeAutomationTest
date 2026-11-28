package com.demoblaze.tests;

import com.demoblaze.pages.ProductPage;
import org.testng.annotations.Test;

public class ProductPageTests extends BaseTest {

    @Test(priority = 0)
    public void openProductDetailsTest(){
        ProductPage productPage = homePage.clickOnPhoneProduct();
        String expectedResult = "Samsung galaxy s6";
        soft.assertEquals(productPage.getProductName(), expectedResult,
                "Expected:"+ expectedResult + "\n"+"found:" + productPage.getProductName());
    }

}
